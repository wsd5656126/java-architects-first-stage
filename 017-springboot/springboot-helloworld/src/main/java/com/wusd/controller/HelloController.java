package com.wusd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/test")
    public String test() {
        int i = 1 / 0;
        return "test";
    }
}
