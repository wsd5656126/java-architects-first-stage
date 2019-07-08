package com.wusd.service;

import com.wusd.dao.LogDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LogService {
    @Autowired
    private LogDao logDao;

    public void addLog() {
        logDao.addLog();
        log.info("end addLog...");
    }
}
