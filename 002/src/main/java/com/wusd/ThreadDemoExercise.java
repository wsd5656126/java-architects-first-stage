package com.wusd;

class ThreadCoin implements Runnable {
    private int j = 0;
    private Object mutex = new Object();
    public boolean flag = true;

    @Override
    public void run() {
        while (true) {
            synchronized (mutex) {
                if (flag) {
                    add();
                } else {
                    reduce();
                }
            }
        }
    }
    public synchronized void add() {
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {

        }
        System.out.println("threadName:" + Thread.currentThread().getName() + ",j++:" + j++);
    }
    public synchronized void reduce() {
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {

        }
        System.out.println("threadName:" + Thread.currentThread().getName() + ",j--:" + j--);
    }
}

public class ThreadDemoExercise {
    public static void main(String[] args) throws Exception {
        ThreadCoin threadCoin = new ThreadCoin();
        Thread thread1 = new Thread(threadCoin, "1");
        Thread thread2 = new Thread(threadCoin, "2");
        Thread thread3 = new Thread(threadCoin, "3");
        Thread thread4 = new Thread(threadCoin, "4");
        thread1.start();
        thread2.start();
        Thread.sleep(40);
        threadCoin.flag = false;
        thread3.start();
        thread4.start();
    }
}
