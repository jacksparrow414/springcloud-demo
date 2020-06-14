package com.example.clienttwo.democlienttwo.controller;

import com.example.clienttwo.democlienttwo.apiservice.TestTransactionService;
import com.example.clienttwo.democlienttwo.entity.User;
import com.example.clienttwo.democlienttwo.service.UserService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@RestController
@RequestMapping(value = "testTransactionClentTwo")
public class TestClientTwoTransactionController {
    @Autowired
    private UserService userService;
    @Autowired
    private TestTransactionService testTransactionService;


    @GlobalTransactional(rollbackFor = Exception.class)
    @PostMapping(value = "clientTwoSave")
    public Integer save(@RequestBody User user){

        com.example.clientone.democlientone.entity.User one = new com.example.clientone.democlientone.entity.User();
        BeanUtils.copyProperties(user,one);
        System.out.println(RootContext.getXID());
        one.setId(4432);
        testTransactionService.clientOneSaveUser(one);
        // 手动抛出异常
        int a = 1/0;
        userService.save(user);
        return user.getId();
    }

    @GlobalTransactional(rollbackFor = Exception.class)
    @GetMapping(value = "tccTwo")
    public Boolean TccTest(){
        Boolean aBoolean = testTransactionService.TccTest();
        if (!aBoolean){
            throw new RuntimeException("第一个方法报错");
        }
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        boolean two = userService.prepare(null, "two", list);
        if (!two){
            throw new RuntimeException("第二个方法报错");
        }
        throw new RuntimeException("强制报错");
        //return true;
    }
}
