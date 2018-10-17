package com.imooc.boy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoyApplication {

    public static void main(String[] args) {

        SpringApplication.run(BoyApplication.class, args);

    }
}