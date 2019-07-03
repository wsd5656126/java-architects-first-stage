package com.wusd;

/**
 * 功能描述:(创建多线程例子-Thread类 重写run方法)
 */
class CreateRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("i:" + i);
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("-----多线程创建开始-----");
        CreateRunnable createRunnable = new CreateRunnable();
        System.out.println("-----多线程创建启动-----");
        Thread thread = new Thread(createRunnable);
        thread.start();
        System.out.println("-----多线程创建结束-----");
    }
}
