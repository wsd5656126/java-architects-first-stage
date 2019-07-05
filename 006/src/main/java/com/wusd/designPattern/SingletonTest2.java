package com.wusd.designPattern;

public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getSingleton();
        Singleton2 s2 = Singleton2.getSingleton();
        System.out.println(s1 == s2);
    }
}

/**
 * 单例模式饿汉模式
 */
class Singleton2 {
    //程序运行时,就直接加载
    private static Singleton2 singleton = new Singleton2();
    private Singleton2() {

    }
    public static Singleton2 getSingleton() {
        return singleton;
    }
}
