package com.wusd.service;

import com.wusd.dao.UserDao;
import com.wusd.entity.User;
import com.wusd.general.util.GUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserDao userDao;

    public void doModify() {
        log.info("doModify...");
        User lij = new User();
        lij.setUserId(GUID.random());
        lij.setUserName("lij");
        lij.setAge(11);
        userDao.insert(lij);
//        int i = 1 / 0;
        lij.setUserId(GUID.random());
        userDao.insert(lij);
    }
}
