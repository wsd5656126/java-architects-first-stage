package com.wusd.ex;

public class CountTest {
    public static void main(String[] args) {
        Count count = new Count();
        AddThread addThread = new AddThread(count);
        SubThread subThread = new SubThread(count);
        Thread t1 = new Thread(addThread, "1");
        Thread t2 = new Thread(addThread, "2");
        Thread t3 = new Thread(subThread, "3");
        Thread t4 = new Thread(subThread, "4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
