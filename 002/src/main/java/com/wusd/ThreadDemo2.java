package com.wusd;

class ThreadTrain2 implements Runnable {
    // 这是货票总票数,多个线程会同时共享资源
    private int trainCount = 100;
    private Object mutex = new Object();// 自定义多线程同步锁

    @Override
    public void run() {
        while (trainCount > 0) {// 循环是指线程不停的去卖票
            try {
                Thread.sleep(40);
            } catch (Exception e) {
            }
            sale();
        }

    }

    /**
     * 出售火车票
     */
    public void sale() {
        synchronized (mutex) {
            if (trainCount > 0) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {

                }
                System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - trainCount + 1) + "张票.");
                trainCount--;
            }
        }

    }
}

public class ThreadDemo2 {
    /**
     * 卖票
     * @param args
     */
    public static void main(String[] args) {
        ThreadTrain2 threadTrain = new ThreadTrain2();// 定义 一个实例
        Thread thread1 = new Thread(threadTrain, "一号窗口");
        Thread thread2 = new Thread(threadTrain, "二号窗口");
        thread1.start();
        thread2.start();
    }
}
