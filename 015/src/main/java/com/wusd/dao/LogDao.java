package com.wusd.dao;

import com.wusd.general.util.GUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class LogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addLog() {
        String sql = "insert into log(logId,actionName,createTime) values(?,?,?)";
        String logId = GUID.random();
        String action = "add";
        long timestamp = System.currentTimeMillis();
        jdbcTemplate.update(sql, logId, action, timestamp);
        log.info("addLog...logId:{},action:{},timestamp:{}", logId, action, timestamp);
    }
}
