package com.jsone.springbootlog.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常
 *  1 捕获返回json的异常
 *  2 捕获跳转页面的异常
 */
@ControllerAdvice(basePackages = "com.jsone.springbootlog.controller")//异常切入点,只要方法上有@requestMapping注解,发生异常会被捕获到
public class GlobalExceptionHandler {
    @ExceptionHandler(MyException.class)//拦截异常,可拦截自定义异常
    @ResponseBody
    public Map<String,Object> exceptionResult(MyException me) {
        Map<String, Object> map = new HashMap<>();
        map.put("errorCode", me.getCode());
        map.put("errorMsg", me.getMsg());
        return map;

    }
}
