package com.wusd;

class PriorityThread implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().toString() + "---i:" + i);
            // 暂停当前正在执行的线程,并执行其他线程(可能没有效果)
            Thread.yield();
        }
    }
}
public class ThreadDemo4 {
    public static void main(String[] args) {
        PriorityThread priorityThread = new PriorityThread();
        Thread t1 = new Thread(priorityThread);
        Thread t2 = new Thread(priorityThread);
        t1.start();
        // 优先级从1到10,默认为5, 分配越高,cpu资源占用越多,但是不一定有效
//        t1.setPriority(10);
        t2.start();
    }
}
