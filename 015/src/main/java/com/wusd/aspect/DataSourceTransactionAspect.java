package com.wusd.aspect;

import com.wusd.manager.TransactionManager;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;

@Aspect
@Component
@Slf4j
public class DataSourceTransactionAspect {
    @Autowired
    TransactionManager transactionManager;

    @Around("execution(* com.wusd.service..*.do*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        TransactionStatus transactionStatus = transactionManager.begin();
        try {
            joinPoint.proceed();
            transactionManager.commit(transactionStatus);
        } catch (Throwable throwable) {
            transactionManager.rollback(transactionStatus);
            throw new Throwable(throwable);
        }
    }

}
