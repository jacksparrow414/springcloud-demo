package com.example.clientthree.democlientthree.provider;

import com.example.clientthree.democlientthree.entity.SwUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    /**
     * 添加用户
     * @param swUser
     * @return
     */
    @PostMapping(value = "addSwUser")
    SwUser addSwUser(@RequestBody SwUser swUser);

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping(value = "listSwUser")
    List<SwUser> listSwUser();
}
