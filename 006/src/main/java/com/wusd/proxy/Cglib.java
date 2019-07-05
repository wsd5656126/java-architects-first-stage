package com.wusd.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Cglib implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是买房中介,开始监听你买房了");
        Object o1 = methodProxy.invokeSuper(o, args);
        System.out.println("我是买房中介,结束监听你买房了");
        return o1;
    }

    public static void main(String[] args) {
        Cglib cglib = new Cglib();
        Enhancer enhancer = new Enhancer();
        //设置被代理的对象
        enhancer.setSuperclass(Person.class);
        //设置代理对象
        enhancer.setCallback(cglib);
        //获得被代理的对象
        House house = (House) enhancer.create();
        house.buy();
    }
}
