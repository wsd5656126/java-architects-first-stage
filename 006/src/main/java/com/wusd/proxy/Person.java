package com.wusd.proxy;

public class Person implements House {
    @Override
    public void buy() {
        System.out.println("我是个人 我要买房了");
    }
}

class Proxy implements House {
    private Person person;

    public Proxy(Person person) {
        this.person = person;
    }

    @Override
    public void buy() {
        System.out.println("我是中介 看你买房开始了");
        person.buy();
        System.out.println("我是中介 看你买房结束了");
    }

    public static void main(String[] args) {
        House proxy = new Proxy(new Person());
        proxy.buy();
    }
}
