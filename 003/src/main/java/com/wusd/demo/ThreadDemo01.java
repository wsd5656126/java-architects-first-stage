package com.wusd.demo;

/**
 * 共享资源
 */
class Res {
    public String name;
    public String sex;
    // flag false out线程未读取值
    public boolean flag = false;
}

/**
 * 写入线程
 */
class InpThread extends Thread {
    public Res res;
    public InpThread(Res res) {
        this.res = res;
    }
    public void run() {
        int count = 0;
        while (true) {
            synchronized (res) {
                if (res.flag) {
                    // 当前线程等待.wait;类似于sleep可以让当前线程,从运行状态变为休眠状态
                    // 使用多线程之间同步 和synchronized 一起使用
                    // wait可以释放锁,sleep不能释放锁.
                    try {
                        res.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                if (count == 0) {
                    res.name = "吴盛东";
                    res.sex = "男";
                } else {
                    res.name = "李洁";
                    res.sex = "女";
                }
                // 实现奇数和偶数
                count = (count + 1) % 2;
                res.flag = true;
                // 和wait 一起使用 唤醒另一个线程 唤醒从阻塞状态变为运行状态
                res.notify();
            }
        }
    }
}

/**
 * 读取线程
 */
class OutThread extends Thread {
    public Res res;
    public OutThread(Res res) {
        this.res = res;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (res) {
                if (!res.flag) {
                    try {
                        res.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                System.out.println(res.name + "---" + res.sex);
                res.flag = false;
                res.notify();
            }
        }
    }
}

/**
 * 第一个线程写入(input)用户,另一个线程读取(out)用户.实现读一个,写一个操作.
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Res res = new Res();
        InpThread inpThread = new InpThread(res);
        OutThread outThread = new OutThread(res);
        inpThread.start();
        outThread.start();
    }

}
