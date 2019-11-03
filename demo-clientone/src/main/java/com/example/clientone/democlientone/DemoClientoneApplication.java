package com.example.clientone.democlientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 在高级版本中不需要添加 @EnableDiscoveryClient 注解,只要在配置文件里配置了eureka的配置,会自动注册到注册中心
 * @author jacksparrow414
 */
@SpringBootApplication
@EnableFeignClients
public class DemoClientoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientoneApplication.class, args);
    }

}
