package com.wusd;

import com.wusd.dao.UserDao;
import com.wusd.entity.User;
import com.wusd.general.util.GUID;
import com.wusd.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.doModify();
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

//        userDao.insert();
    }
}
