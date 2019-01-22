package com.jsone.springbootlog.controller;

import com.jsone.springbootlog.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    //统一处理异常
    @RequestMapping("/test")
    public String test(Integer i) {
        int j = 1 / i;//模拟业务处理
        return "success";
    }

    //处理并打印自定义异常
    @RequestMapping("/test3")
    public String test3(String name) {
        log.info("打印日志:发生了自定义异常");
        throw new MyException("404", "发生自定义异常");
        //throw new MyException("发生异常");
        //return "success" + name;
    }

    @RequestMapping("/test2")
    public String test2(String name) {
        return "success" + name;
    }
}
