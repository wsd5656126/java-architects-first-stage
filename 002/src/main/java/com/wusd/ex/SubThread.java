package com.wusd.ex;

public class SubThread implements Runnable {
    private Count count;
    public SubThread(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        while (true) {
            count.sub();
        }
    }
}
