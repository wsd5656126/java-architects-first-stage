package com.wusd;

class ThreadVolatileDemo extends Thread {
    // 加上volatile保证flag的修改可见
    // 否则子线程会一直运行
    private volatile boolean flag = true;
    public void run() {
        System.out.println("开始子线程...");
        while (flag) {
        }
        System.out.println("线程停止");
    }
    public void setRunning(boolean flag) {
        this.flag = flag;
    }
}
public class ThreadVolatile {
    public static void main(String[] args) throws InterruptedException {
        ThreadVolatileDemo threadVolatileDemo = new ThreadVolatileDemo();
        threadVolatileDemo.start();
        Thread.sleep(1000);
        System.out.println("flag已经设置为false");
        threadVolatileDemo.setRunning(false);
        Thread.sleep(1000);
    }
}
