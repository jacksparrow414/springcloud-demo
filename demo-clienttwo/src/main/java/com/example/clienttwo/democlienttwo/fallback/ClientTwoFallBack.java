package com.example.clienttwo.democlienttwo.fallback;

import com.example.clientone.democlientone.entity.SwUser;
import com.example.clienttwo.democlienttwo.apiservice.TestOneControllerService;
import feign.hystrix.FallbackFactory;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 当feign调用失败时，处理失败的情况.<br/>
 * <a href="https://docs.spring.io/spring-cloud-openfeign/docs/2.2.5.RELEASE/reference/html/#spring-cloud-feign-hystrix-fallback">spring-cloud-feign官方文档</a>
 * 注意这里的回调依赖于hystrix，所以配置文件中要开启
 * feign:
 *   hystrix:
 *     enabled: true
 * @author jacksparrow414
 * @date 2019/12/2 14:56
 */
@Component
public class ClientTwoFallBack implements FallbackFactory<TestOneControllerService> {
    
    private static final Logger logger = LoggerFactory.getLogger(ClientTwoFallBack.class);
    
    @Override
    public TestOneControllerService create(Throwable throwable) {
        logger.error("错误信息为：", throwable);
        return new TestOneControllerService() {
            @Override
            public String testOne() {
                return "test one回调";
            }
    
            @Override
            public SwUser addSwUser(final SwUser swUser) {
                return new SwUser();
            }
    
            @Override
            public List<SwUser> listSwUser() {
                return Collections.emptyList();
            }
        };
    }
}
