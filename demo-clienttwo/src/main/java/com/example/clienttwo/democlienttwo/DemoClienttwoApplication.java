package com.example.clienttwo.democlienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 在高级版本中不需要添加 @EnableDiscoveryClient 注解,只要在配置文件里配置了eureka的配置,会自动注册到注册中心<br/>
 * TODO 如何在多个微服务之间传递token?
 * 思路：网关-是通过zuul转发到clientTwo微服务上的，clientTwo调用clientOne是通过feign调用的。
 * 那么可以当请求进入clientTwo时，首先进行拦截，取出header中的token，放到全局map中去。当clientTwo调用clientOne时，利用feign的addInterceptor方法将header设置进去，从而完成传递
 *
 * @author jacksparrow414
 */
@SpringBootApplication
@EnableFeignClients
public class DemoClienttwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoClienttwoApplication.class, args);
    }

}
