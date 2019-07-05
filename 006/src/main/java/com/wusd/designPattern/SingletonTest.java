package com.wusd.designPattern;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}

/**
 * 单例模式.懒汉
 */
class Singleton {
    //当需要时才加载
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

