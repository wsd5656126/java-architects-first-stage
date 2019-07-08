package com.wusd.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

@Component
public class TransactionManager {
    @Autowired
    private DataSourceTransactionManager transactionManager;

    public TransactionStatus begin() {
        return transactionManager.getTransaction(new DefaultTransactionAttribute());
    }

    public void commit(TransactionStatus transactionStatus) {
        transactionManager.commit(transactionStatus); // 数据会提交到数据库中
    }

    public void rollback(TransactionStatus transactionStatus) {
        transactionManager.rollback(transactionStatus);
    }
}
