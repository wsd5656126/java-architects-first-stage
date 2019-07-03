package com.wusd;

class StopThread implements Runnable {
    private boolean flag = true;

    @Override
    // 同步方法是为了flag线程安全
    public synchronized void run() {
        while (flag) {
            try {
                // 等待interrupt异常来结束进程
                wait();
            } catch (Exception e) {
                // 具体结束进程操作
                stopThread();
            }
            System.out.println("thread run..");
        }
    }

    /**
     * 停止线程
     */
    public void stopThread() {
        flag = false;
    }
}
public class StopThreadDemo {
    public static void main(String[] args) {
        StopThread stopThread1 = new StopThread();
        Thread t1 = new Thread(stopThread1);
        Thread t2 = new Thread(stopThread1);
        t1.start();
        t2.start();
        int cnt = 0;
        while (true) {
            System.out.println("thread main..");
            if (cnt == 300) {
                t1.interrupt();
                t2.interrupt();
                break;
            }
            cnt++;
        }
    }
}
