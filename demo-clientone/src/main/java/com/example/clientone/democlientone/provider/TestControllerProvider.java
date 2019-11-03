package com.example.clientone.democlientone.provider;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * client1对外提供的微服务方法
 * @author jacksparrow414
 */
@RequestMapping(value = "/testOneController")
public interface TestControllerProvider {

    /**
     * 测试方法一
     * @return
     */
    @RequestMapping(value = "testOne")
     String testOne();
}
