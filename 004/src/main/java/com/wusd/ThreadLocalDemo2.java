package com.wusd;

class Res {
    private static int cnt = 0;
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    public Integer getNum() {
        int cnt = threadLocal.get() + 1;
        threadLocal.set(cnt);
        return cnt;
    }
}
public class ThreadLocalDemo2 extends Thread {
    private Res res;
    public ThreadLocalDemo2(Res res) {
        this.res = res;
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i + "---num:" + res.getNum());
        }
    }

    public static void main(String[] args) {
        Res res = new Res();
        ThreadLocalDemo2 t1 = new ThreadLocalDemo2(res);
        ThreadLocalDemo2 t2 = new ThreadLocalDemo2(res);
        ThreadLocalDemo2 t3 = new ThreadLocalDemo2(res);
        t1.start();
        t2.start();
        t3.start();
    }
}
