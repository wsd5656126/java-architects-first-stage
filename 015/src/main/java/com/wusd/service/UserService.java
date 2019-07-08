package com.wusd.service;

import com.wusd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LogService logService;

    public void add() {

    }
}
