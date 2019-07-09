package com.wusd.manager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

@Service
@Slf4j
public class TransactionManager {
    @Autowired
    DataSourceTransactionManager transactionManager;

    /**
     * 开启事物
     * @return
     */
    public TransactionStatus begin() {
        TransactionStatus transactionStatus = transactionManager.getTransaction(new DefaultTransactionAttribute());
        log.debug("begin()...transactionStatus:{}", transactionStatus);
        return transactionStatus;
    }

    /**
     * 事物提交
     * @param transactionStatus
     */
    public void commit(TransactionStatus transactionStatus) {
        log.debug("commit()...transactionStatus:{}", transactionStatus);
        transactionManager.commit(transactionStatus);
    }

    /**
     * 事物回滚
     * @param transactionStatus
     */
    public void rollback(TransactionStatus transactionStatus) {
        log.debug("rollback()...transactionStatus:{}", transactionStatus);
        transactionManager.rollback(transactionStatus);
    }
}
