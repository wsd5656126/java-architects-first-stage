package com.wusd.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolTest {
    public static void main(String[] args) {
        // 定长线程池,可控制线程最大并发数
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 1040000; i++) {
            int index = i;
            newFixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName() + "----" + index);
                }
            });
        }
    }
}
