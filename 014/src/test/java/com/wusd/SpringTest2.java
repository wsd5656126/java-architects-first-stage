package com.wusd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        Object userDao = applicationContext.getBean("userDao");
        Object userService = applicationContext.getBean("userService");
        Object userService2 = applicationContext.getBean("userService2");
        log.info("");
    }
}
