package com.wusd;

class JoinThread implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().toString() + "---i:" + i);
        }
    }
}
public class JoinThreadDemo {
    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread();
        Thread t1 = new Thread(joinThread);
        Thread t2 = new Thread(joinThread);
        t1.start();
        t2.start();
        try {
            // t1先执行,其它等待.但是实际情况是所有的子线程先运行,主线程等待
            t1.join();
        } catch (InterruptedException e) {

        }
        for (int i = 0; i < 100; i++) {
            System.out.println("main ---i:" + i);
        }
    }
}
