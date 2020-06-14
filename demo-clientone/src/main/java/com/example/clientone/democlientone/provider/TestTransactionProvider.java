package com.example.clientone.democlientone.provider;

import com.example.clientone.democlientone.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@RequestMapping(value = "testTransaction")
public interface TestTransactionProvider {

    /**
     *
     * @return
     */
    @PostMapping(value = "save")
    Integer clientOneSaveUser(@RequestBody User user);

    @GetMapping(value = "test")
    Boolean TccTest();
}
