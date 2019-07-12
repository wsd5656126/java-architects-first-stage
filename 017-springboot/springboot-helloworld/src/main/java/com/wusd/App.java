package com.wusd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//包扫描范围
@ComponentScan(basePackages = "com.wusd")
//根据maven配置,自动配置
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        //标记为启动类
        SpringApplication.run(App.class, args);
    }
}
