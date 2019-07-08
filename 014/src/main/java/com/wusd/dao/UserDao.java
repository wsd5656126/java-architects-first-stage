package com.wusd.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class UserDao {
    private boolean flag;

    public void add() {
        log.info("UserDao.add...flag:{}", flag);
    }

    public void setFlag(boolean flag) {
        log.info("UserDao.this.flag:{}", flag);
        this.flag = flag;
    }
}
