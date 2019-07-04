package com.wusd.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorTest {
    public static void main(String[] args) {
        // 单个线程的线程池,执行工作遵循队列顺序
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            int index = i;
            newSingleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "----" + index);
                }
            });
        }
    }
}
