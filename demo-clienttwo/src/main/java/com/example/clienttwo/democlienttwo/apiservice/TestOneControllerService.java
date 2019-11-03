package com.example.clienttwo.democlienttwo.apiservice;

import com.example.clientone.democlientone.provider.TestControllerProvider;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * client2调用client1微服务
 * client1中的contentPath 不是/,所以这里要配置path参数,否则会报404,找不到
 * @author jacksparrow414
 */
@FeignClient(value = "demo-clientone",path = "/clientOne")
public interface TestOneControllerService extends TestControllerProvider {
}
