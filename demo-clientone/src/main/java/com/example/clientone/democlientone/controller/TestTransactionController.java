package com.example.clientone.democlientone.controller;

import com.example.clientone.democlientone.entity.User;
import com.example.clientone.democlientone.provider.TestTransactionProvider;
import com.example.clientone.democlientone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@RestController
public class TestTransactionController implements TestTransactionProvider {

    @Autowired
    private UserService userService;
    @Override
    public Integer clientOneSaveUser(User user) {

        return Optional.of(userService.save(user)).map(u->user.getId()).orElse(null);
    }

    @Override
    public Boolean TccTest() {
        return userService.prepare(null,1);
    }
}
