package com.example.clientone.democlientone.controller;

import com.example.clientone.democlientone.provider.TestControllerProvider;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里的@RequestMapping注解是直接继承TestControllerProvider,不需要再次添加
 * @Author jacksparrow414
 * @Date 2019-11-02
 * @Description: TODO
 */
@RestController
public class TestController implements TestControllerProvider {


    @Override
    public String testOne() {
        System.out.println("this is testOne");
        return "testOne";
    }
}
