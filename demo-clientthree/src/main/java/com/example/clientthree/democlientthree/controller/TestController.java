package com.example.clientthree.democlientthree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksparrow414
 * @Date 2019-11-02
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/testOneController")
public class TestController {

    @RequestMapping(value = "testOne")
    public String testOne(){
        System.out.println("this is clientOneCopy");
        return "testThree";
    }
}
