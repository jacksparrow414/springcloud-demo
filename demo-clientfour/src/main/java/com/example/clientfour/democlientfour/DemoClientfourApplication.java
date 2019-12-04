package com.example.clientfour.democlientfour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoClientfourApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientfourApplication.class, args);
    }

}
