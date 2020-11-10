package com.example.clienttwo.democlienttwo.apiservice;

import com.example.clientone.democlientone.provider.TestControllerProvider;
import com.example.clienttwo.democlienttwo.fallback.ClientTwoFallBack;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * client2调用client1微服务<br/>
 * client1中的contentPath 不是/,所以这里要配置path参数,否则会报404,找不到.<br/>
 * 或者也可在TestControllerProvider中加上path前缀.两种方式都可以
 * @author jacksparrow414
 */
@FeignClient(value = "demo-clientone",path = "/clientOne",fallbackFactory  = ClientTwoFallBack.class )
public interface TestOneControllerService extends TestControllerProvider {
}
