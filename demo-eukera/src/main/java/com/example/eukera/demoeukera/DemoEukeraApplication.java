package com.example.eukera.demoeukera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEukeraApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEukeraApplication.class, args);
    }

}
