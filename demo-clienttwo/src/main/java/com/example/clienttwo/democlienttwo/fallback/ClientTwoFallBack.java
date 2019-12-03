package com.example.clienttwo.democlienttwo.fallback;

import com.example.clienttwo.democlienttwo.apiservice.TestOneControllerService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author dhb
 * @date 2019/12/2 14:56
 */
@Component
public class ClientTwoFallBack implements FallbackFactory<TestOneControllerService> {
    Logger logger = LoggerFactory.getLogger(ClientTwoFallBack.class);
    @Override
    public TestOneControllerService create(Throwable throwable) {
        logger.error("错误信息为：",throwable);
        return () -> "降级";
    }
}
