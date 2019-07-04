package com.wusd;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileNoAtomic extends Thread {
    private /*volatile*/ static int count = 0;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public void run() {
        for (int i = 0; i < 1000; i++) {
            // i++
            count++;
            count = atomicInteger.incrementAndGet();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        VolatileNoAtomic[] volatileNoAtomics = new VolatileNoAtomic[10];
        for (int i = 0; i < volatileNoAtomics.length; i++)
            volatileNoAtomics[i] = new VolatileNoAtomic();
        for (int i = 0; i < volatileNoAtomics.length; i++) {
            volatileNoAtomics[i].start();
        }
    }
}
/**
 * 结果不同步,volatile不具备原子性
 */
