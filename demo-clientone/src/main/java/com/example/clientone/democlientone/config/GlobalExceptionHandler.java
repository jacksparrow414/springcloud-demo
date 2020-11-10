package com.example.clientone.democlientone.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jacksparrow414
 * @date 2020/11/10
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ResponseBody
    @ExceptionHandler(value = ArithmeticException.class)
    public String handleArithmeticException(ArithmeticException arithmeticException) {
        return "我是算术异常";
    }
}
