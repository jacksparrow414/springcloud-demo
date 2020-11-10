package com.example.eukera.demoeukera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * TODO 服务上线推送到所有实例上去，服务下线推送到所有实例上去。而不是靠每个微服务定时去拉这种方式
 * TODO 通过EventListener监听具体的事件
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoEukeraApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEukeraApplication.class, args);
    }

}
