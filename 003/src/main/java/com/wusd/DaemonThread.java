package com.wusd;

/**
 * 什么事守护线程? 守护线程 进程线程(主线程挂了) 守护线程也会被自动销毁
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我是子线程...");
                }
            }
        });
        // 设置线程为守护线程
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我是主线程");
        }
        System.out.println("主线程执行完毕");
    }
}
