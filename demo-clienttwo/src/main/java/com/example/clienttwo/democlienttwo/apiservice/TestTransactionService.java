package com.example.clienttwo.democlienttwo.apiservice;

import com.example.clientone.democlientone.provider.TestTransactionProvider;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@FeignClient(value = "demo-clientone" ,path = "/clientOne")
public interface TestTransactionService extends TestTransactionProvider {

//    @PostMapping(value = "save")
//    Integer clientOneSaveUser(@RequestBody User user);
}
