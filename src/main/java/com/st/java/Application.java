package com.st.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@ComponentScan("com.st.java")
@EnableScheduling
@EnableCaching
@EnableAsync
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
