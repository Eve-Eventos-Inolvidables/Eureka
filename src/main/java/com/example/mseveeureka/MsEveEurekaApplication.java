package com.example.mseveeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsEveEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsEveEurekaApplication.class, args);
    }

}
