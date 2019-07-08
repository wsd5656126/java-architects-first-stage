package com.wusd.service;

import com.wusd.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserService {
    @Resource(name = "userDao")
    private UserDao userDao1;

    public void add() {
        log.info("add...");
//        userDao1.add();
    }

    public void setUserDao1(UserDao userDao1) {
        log.info("UserService.setUserDao...userDao1:{}", userDao1);
        this.userDao1 = userDao1;
    }
}
