package com.jsone.springbootlog.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private Integer id;
    private String name;
}
