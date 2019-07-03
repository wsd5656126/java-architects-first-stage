package com.wusd.ex;

public class AddThread implements Runnable {
    private Count count;
    public AddThread(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (true) {
            count.add();
        }
    }
}
