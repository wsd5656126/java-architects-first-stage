package com.wusd;

/**
 * 使用匿名内部类方式创建多线程
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        System.out.println("-----多线程创建开始-----");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    System.out.println("i:" + i);
            }
        });
        System.out.println("-----多线程创建执行-----");
        thread.start();
        System.out.println("-----多线程创建结束-----");
    }
}
