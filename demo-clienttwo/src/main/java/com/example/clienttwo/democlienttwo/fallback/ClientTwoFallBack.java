package com.example.clienttwo.democlienttwo.fallback;

import com.example.clienttwo.democlienttwo.apiservice.TestOneControllerService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author dhb
 * @date 2019/12/2 14:56
 */
@Component
public class ClientTwoFallBack implements FallbackFactory<TestOneControllerService> {
    @Override
    public TestOneControllerService create(Throwable throwable) {
        return () -> "降级";
    }
}
