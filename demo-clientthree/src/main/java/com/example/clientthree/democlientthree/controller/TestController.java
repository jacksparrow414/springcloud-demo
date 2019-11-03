package com.example.clientthree.democlientthree.controller;

import com.example.clientthree.democlientthree.provider.TestControllerProvider;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jacksparrow414
 * @Date 2019-11-02
 * @Description: TODO
 */
@RestController
public class TestController implements TestControllerProvider {


    @Override
    public String testOne(){
        System.out.println("this is clientOneCopy");
        return "testThree";
    }
}
