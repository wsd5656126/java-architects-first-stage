package com.wusd;

/**
 * 证明:静态同步函数不是this锁
 */
class StaticThreadTrain5 implements Runnable {
    // 这是货票总票数,多个线程会同时共享资源
    private static int trainCount = 100;
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
    public static synchronized void sale() {
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

public class StaticThreadDemo {
    /**
     * 卖票
     * @param args
     */
    public static void main(String[] args) throws Exception {
        StaticThreadTrain5 threadTrain = new StaticThreadTrain5();// 定义 一个实例
        Thread thread1 = new Thread(threadTrain, "一号窗口");
        Thread thread2 = new Thread(threadTrain, "二号窗口");
        thread1.start();
        Thread.sleep(40);
        threadTrain.flag = false;
        thread2.start();
    }
}
