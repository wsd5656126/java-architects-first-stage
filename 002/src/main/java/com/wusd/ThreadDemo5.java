package com.wusd;

/**
 * 证明方式同步函数使用this锁.
 */
class ThreadTrain5 implements Runnable {
    // 这是货票总票数,多个线程会同时共享资源
    private int trainCount = 100;
    public boolean flag = true;
    private Object mutex = new Object();

    public void run() {
        if (flag) {
            while (true) {
                synchronized (mutex) {
                    if (trainCount > 0) {
                        try {
                            Thread.sleep(40);
                        } catch (Exception e) {

                        }
                        System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - trainCount + 1) +
                        "张票.");
                        trainCount--;
                    }
                }
            }
        } else {
            while (true) {
                sale();
            }
        }
    }
    public synchronized void sale() {
        if (trainCount > 0) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - trainCount + 1) +
                    "张票.");
            trainCount--;
        }
    }
}

public class ThreadDemo5 {
    /**
     * 卖票
     * @param args
     */
    public static void main(String[] args) throws Exception {
        ThreadTrain5 threadTrain = new ThreadTrain5();// 定义 一个实例
        Thread thread1 = new Thread(threadTrain, "一号窗口");
        Thread thread2 = new Thread(threadTrain, "二号窗口");
        thread1.start();
        Thread.sleep(40);
        threadTrain.flag = false;
        thread2.start();
    }
}
