package com.wusd.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadTest {
    public static void main(String[] args) {
        // 创建可缓存的连接池,具体表现为线程不够时创建,线程空闲时利用
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 30; i++) {
            int cnt = i;
            // 执行execute, 类似于run()
            newCachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "---cnt:" + cnt);
                }
            });
        }
    }
}
