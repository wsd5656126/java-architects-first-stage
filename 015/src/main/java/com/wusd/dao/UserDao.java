package com.wusd.dao;

import com.wusd.BeansToSql;
import com.wusd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insert(User user) {
        String insertSql = BeansToSql.insertSql(user);
        jdbcTemplate.execute(insertSql);
    }
}
