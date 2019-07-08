package com.wusd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring4.xml");
        Object userDao = applicationContext.getBean("userDao");
        Object userDaoD = applicationContext.getBean("userDaoD");
        System.out.println();
    }
}
