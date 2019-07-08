package com.wusd.dao;

import com.wusd.general.util.GUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void addUser(String userName, Integer age) {
        String sql = "insert into user(userId,userName,age) values(?,?,?)";
        String userId = GUID.random();
        jdbcTemplate.update(sql, userId, userName, age);
        log.info("addUser...sql:{}", sql);
    }
}
