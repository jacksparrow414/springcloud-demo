package com.example.clientthree.democlientthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoClientthreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientthreeApplication.class, args);
    }

}
