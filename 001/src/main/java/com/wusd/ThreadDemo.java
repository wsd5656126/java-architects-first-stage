package com.wusd;

/**
 * 功能描述:(创建多线程例子-Thread类 重写run方法)
 */
class CreateThread extends Thread {
    // run方法中编写 多线程需要执行的代码
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("-----多线程创建开始-----");
        // 1.创建一个线程
        CreateThread createThread = new CreateThread();
        System.out.println("-----多线程创建启动-----");
        // 2.开始执行线程 注意 开始线程不是调用run方法, 而是start方法
        createThread.start();
        System.out.println("-----多线程创建结束-----");
    }
}
