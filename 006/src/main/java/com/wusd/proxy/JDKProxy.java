package com.wusd.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理的使用方法
 */
public class JDKProxy implements InvocationHandler {
    //被代理的对象
    private Object target;
    public JDKProxy(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是中介...开始监听你买房了");
        //调用代理方法 注意是调用target
        Object o = method.invoke(target, args);
        System.out.println("我是中介...结束监听你买房了");
        return o;
    }

    public static void main(String[] args) {
        Person xiaoming = new Person();
        JDKProxy jdkProxy = new JDKProxy(xiaoming);
        House house = (House) Proxy.newProxyInstance(Person.class.getClassLoader(),
                Person.class.getInterfaces(), jdkProxy);
        house.buy();
    }
}
