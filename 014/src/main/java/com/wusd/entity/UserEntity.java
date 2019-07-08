package com.wusd.entity;

import lombok.Data;
import lombok.ToString;
//import lombok.extern.slf4j.Slf4j;

@Data
@ToString
//@Slf4j
public class UserEntity {
    private String name;
    private Integer age;

    public UserEntity() {
        System.out.println("无参构造器");
    }

    public UserEntity(String name, Integer age) {
        System.out.println("有参构造器 name:" + name + ",age:" + age);
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//        log.info("test");
    }
}
