package com.funny.txstack.http;

import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * created by yaoyongbing on 2018/6/26
 */
public class HttpClientUtils {
	private static final Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);

	public static CloseableHttpClient acceptsUntrustedCertsHttpClient()
			throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
		HttpClientBuilder b = HttpClientBuilder.create();
		b.setRetryHandler(new HttpRequestRetryHandler(){
			@Override
			public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
				if (executionCount > 3) {
					logger.warn("[HttpClientUtils]Maximum tries reached for client http pool ");
					return false;
				}
				if (exception instanceof org.apache.http.NoHttpResponseException) {
					logger.warn("[HttpClientUtils]No response from server on " + executionCount + " call");
					return true;
				}
				return false;
			}
		});

		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
			public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
				return true;
			}
		}).build();
		b.setSSLContext(sslContext);

		HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;

		SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
		Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
				.register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslSocketFactory)
				.build();

		PoolingHttpClientConnectionManager connMgr = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		connMgr.setMaxTotal(200);
		connMgr.setDefaultMaxPerRoute(100);
		b.setConnectionManager(connMgr);

		CloseableHttpClient client = b.build();
		return client;
	}
}