package com.funny.txstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fangli
 */
@SpringBootApplication
@ComponentScan(value = "com.funny.txstack")
public class TXStackApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TXStackApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TXStackApplication.class, args);
    }
}
