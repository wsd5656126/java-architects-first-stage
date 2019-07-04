package com.wusd.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserEntity {
    private String userId;
    private String userName;
    public UserEntity() {
        System.out.println("使用反射技术, 执行无参数构造函数");
    }
    public UserEntity(String userId) {
        this.userId = userId;
        System.out.println("使用反射技术, 执行有参构造函数 userId:" + userId);
    }
}
