package com.wusd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Res {
    public String userSex;
    public String userName;
    // 多线程锁
    Lock lock = new ReentrantLock();
    // 线程间通讯标志 true:只读 false:操作
    public boolean flag = false;
    // 用于唤醒,wait
    Condition condition = lock.newCondition();
}

class IntThread extends Thread {
    private Res res;

    public IntThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        // 用于修改res属性,标志
        int count = 0;
        while (true) {
            try {
                // 拿到锁
                res.lock.lock();
                // 如果是只读状态
                if (res.flag) {
                    try {
                        // 线程进入睡眠状态,等待读取
                        // 接到其它线程通知, 线程继续
                        res.condition.await();
                    } catch (Exception e) {
                    }
                }
                //修改状态
                if (count == 0) {
                    res.userName = "吴盛东";
                    res.userSex = "男";
                } else {
                    res.userName = "李洁";
                    res.userSex = "女";
                }
                count = (count + 1) % 2;
                // 告诉其它线程可以读取
                res.flag = true;
                // 唤醒其它线程, 马上释放锁
                res.condition.signal();
            } catch (Exception e) {

            } finally {
                res.lock.unlock();
            }
        }
    }
}

class OutThread extends Thread {
    private Res res;

    public OutThread(Res res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            try {
                res.lock.lock();
                if (!res.flag) {
                    try {
                        res.condition.await();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(res.userName + "---" + res.userSex);
                res.flag = false;
                res.condition.signal();
            } catch (Exception e) {
            } finally {
                res.lock.unlock();
            }

        }
    }

}

public class ThreadCommun {
    public static void main(String[] args) {
        Res res = new Res();
        Thread t1 = new IntThread(res);
        Thread t2 = new OutThread(res);
        t1.start();
        t2.start();
    }
}
