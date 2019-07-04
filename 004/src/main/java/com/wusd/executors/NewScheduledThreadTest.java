package com.wusd.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadTest {
    public static void main(String[] args) {
        // 定长定时线程池
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
        newScheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("3秒中之后执行...");
            }
        }, 5, TimeUnit.SECONDS);
    }
}
