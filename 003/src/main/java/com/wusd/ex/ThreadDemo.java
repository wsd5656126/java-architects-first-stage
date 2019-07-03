package com.wusd.ex;
class JoinThread implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().toString() + "---i:" + i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread();
        Thread t1 = new Thread(joinThread);
        Thread t2 = new Thread(joinThread);
        Thread t3 = new Thread(joinThread);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
        }
        t3.start();
    }
}
