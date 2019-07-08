package com.wusd;

import com.wusd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringTest5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring5.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.add();
    }
}
