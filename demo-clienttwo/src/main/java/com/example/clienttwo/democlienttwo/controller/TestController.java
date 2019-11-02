package com.example.clienttwo.democlienttwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksparrow414
 * @Date 2019-11-02
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/testTwoController")
public class TestController {

    @RequestMapping(value = "testTwo")
    public String testTwo() {
        System.out.println("this is testTwo");
        return "testTwo";
    }
}
