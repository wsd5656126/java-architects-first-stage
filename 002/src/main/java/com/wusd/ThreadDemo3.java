package com.wusd;

class ThreadTrain3 implements Runnable {
    // 这是货票总票数,多个线程会同时共享资源
    private int trainCount = 100;

    @Override
    public void run() {
        while (trainCount > 0) {// 循环是指线程不停的去卖票
            sale();
            try {
                Thread.sleep(40);
            } catch (Exception e) {

            }
        }

    }

    /**
     * 出售火车票
     */
    public synchronized void sale() {
        if (trainCount > 0) {
            System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - trainCount + 1) + "张票.");
            trainCount--;
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }
}

public class ThreadDemo3 {
    /**
     * 卖票
     * @param args
     */
    public static void main(String[] args) {
        ThreadTrain3 threadTrain = new ThreadTrain3();// 定义 一个实例
        Thread thread1 = new Thread(threadTrain, "一号窗口");
        Thread thread2 = new Thread(threadTrain, "二号窗口");
        thread1.start();
        thread2.start();
    }
}
