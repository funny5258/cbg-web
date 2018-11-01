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
public class RealTimeApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RealTimeApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RealTimeApplication.class, args);
    }
}
