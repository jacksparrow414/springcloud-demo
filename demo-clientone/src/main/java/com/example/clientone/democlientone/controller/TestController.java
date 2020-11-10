package com.example.clientone.democlientone.controller;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.example.clientone.democlientone.entity.SwUser;
import com.example.clientone.democlientone.provider.TestControllerProvider;
import com.example.clientone.democlientone.service.SwUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里的@RequestMapping注解是直接继承TestControllerProvider,不需要再次添加
 * @author jacksparrow414 uthor
 * @date  2019-11-02
 */
@RestController
public class TestController implements TestControllerProvider {

    @Autowired
    private SwUserService swUserService;

    @Override
    public String testOne() {
        System.out.println("this is testOne");
        // 测试client的fallback的快速失败是否生效
         int a = 1/0;
        return "testOne";
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
