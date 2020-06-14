package com.example.clienttwo.democlienttwo.controller;

import com.example.clientone.democlientone.entity.SwUser;
import com.example.clienttwo.democlienttwo.apiservice.TestOneControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author jacksparrow414
 * @Date 2019-11-02
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/testTwoController")
public class TestController {

    @Autowired
    private TestOneControllerService testOneControllerService;

    @RequestMapping(value = "testTwo")
    public String testTwo() {
        System.out.println("this is testTwo");
        return "testTwo";
    }

    @RequestMapping(value = "testRpc")
    public String testRpc(){
        String s = testOneControllerService.testOne();
        System.out.println(s);
        return s;
    }

    @RequestMapping(value = "getOneServiceUser")
    public List<SwUser> getOneServiceUser(){
       return testOneControllerService.listSwUser();
    }

    @PostMapping(value = "addOneServiceUser")
    public SwUser addOneServiceUser(@RequestBody SwUser swUser){
        return  testOneControllerService.addSwUser(swUser);
    }
}
