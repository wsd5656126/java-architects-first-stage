package com.wusd.ex;

public class Count {
    private int num = 0;
    private boolean flag = false;
    public synchronized void add() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("ThreadName:" + Thread.currentThread().getName() + ",num++:" + num++);
        flag = true;
        //唤醒其他所有线程
        notifyAll();
    }
    public synchronized void sub() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("ThreadName:" + Thread.currentThread().getName() + ",num--:" + num--);
        flag = false;
        //唤醒其他所有线程
        notifyAll();
    }
}
