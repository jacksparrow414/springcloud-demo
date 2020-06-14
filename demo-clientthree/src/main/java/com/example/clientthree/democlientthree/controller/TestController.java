package com.example.clientthree.democlientthree.controller;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.example.clientthree.democlientthree.entity.SwUser;
import com.example.clientthree.democlientthree.provider.TestControllerProvider;
import com.example.clientthree.democlientthree.service.SwUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author jacksparrow414
 * @Date 2019-11-02
 * @Description: TODO
 */
@RestController
public class TestController implements TestControllerProvider {

    @Autowired
    private SwUserService swUserService;
    @Override
    public String testOne(){
        System.out.println("this is clientOneCopy");
        return "testThree";
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SwUser addSwUser(SwUser swUser) {
        swUser.setId(IdWorker.getId());
        swUserService.save(swUser);
        return swUser;
    }

    @Override
    public List<SwUser> listSwUser() {
        return swUserService.list();
    }
}
