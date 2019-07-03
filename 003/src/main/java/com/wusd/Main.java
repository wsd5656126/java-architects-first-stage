package com.wusd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main implements Runnable {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    @Override
    public void run() {
        lock.lock();
        try {
            // 可能会出现线程安全的操作
        } finally {
            // 一定在finally中释放锁
            // 也不能把获取锁在try中进行, 因为有可能获取锁的时候抛出异常
            lock.unlock();
        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        // 类似wait
        main.condition.await();
        // 类型notify
        main.condition.signal();
    }
}
