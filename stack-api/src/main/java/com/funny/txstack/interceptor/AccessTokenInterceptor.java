package com.funny.txstack.interceptor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限类的校验
 */
@Component
public class AccessTokenInterceptor extends HandlerInterceptorAdapter {

    public AccessTokenInterceptor() {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        String custId = request.getHeader(Constants.ACCOUNT_ID);
//        String token = request.getHeader(Constants.TOKEN);
//        if (StringUtils.isBlank(custId) || StringUtils.isBlank(token)) {
//            throw new RestException(NkaError.NND_0332);
//        }
//        if (!StringUtils.isNumeric(custId)) {
//            throw new RestException(NkaError.NND_0332);
//        }
//        RestResponse<String> getTokenResp = applicationContext.getBean(CustLoginClient.class).getToken(Integer.parseInt(custId));
//        String tokenInDb = getTokenResp.getResponse();
//        if (StringUtils.isBlank(tokenInDb) || !tokenInDb.equals(token)) {
//            throw new RestException(NkaError.NND_0332);
//        }
        return true;
    }
}