package com.wusd.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class Aop {
    @Before("execution(* com.wusd.service.UserService.add(..))")
    public void begin() {
        log.info("begin() spring aop before");
    }

    @After("execution(* com.wusd.service.UserService.add(..))")
    public void commit() {
        log.info("commit() spring aop after");
    }

    @AfterThrowing("execution(* com.wusd.service.UserService.add(..))")
    public void error() {
        log.info("error() spring aop afterThrowing");
    }

    @AfterReturning("execution(* com.wusd.service.UserService.add(..))")
    public void run() {
        log.info("run() spring aop afterReturning");
    }

    @Around("execution(* com.wusd.service.UserService.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("around() spring aop around before");
        proceedingJoinPoint.proceed();
        log.info("around() spring aop around after");
    }
}
