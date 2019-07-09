package com.wusd.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;
    private Integer age;
}
