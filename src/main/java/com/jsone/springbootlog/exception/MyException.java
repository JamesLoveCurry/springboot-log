package com.jsone.springbootlog.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
//@AllArgsConstructor
//@RequiredArgsConstructor
public class MyException extends RuntimeException {
    private String code;
    private String msg;

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
