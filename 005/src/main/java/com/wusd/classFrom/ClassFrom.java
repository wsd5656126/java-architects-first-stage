package com.wusd.classFrom;

import com.wusd.entity.UserEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassFrom {
    public static void main(String[] args) throws Exception {
        // 1.除了new创建对象,还可以使用反射机制创建对象.
        // 2.forName必须传入class类的完整路径.
        Class<?> forName = Class.forName("com.wusd.entity.UserEntity");
        // 3.newInstance使用无参数构造函数 创建对象 new
//        Object newInstance = forName.newInstance();
//        UserEntity user = (UserEntity) newInstance;
//        System.out.println(user);
//        user.setUserId("123");
//        System.out.println(user.getUserId());
        // 使用反射技术创建对象和new 哪个效率高? new 效率高.

//        Constructor<?> constructor = forName.getConstructor(String.class);
//        Object newInstance = constructor.newInstance("123");
//        UserEntity user = (UserEntity) newInstance;
//        System.out.println(user);


//        // 获取所有该类的所有方法
//        Method[] methods = forName.getMethods();
//        for (Method method : methods) {
//            System.out.println("method:" + method.getName() + "-" + method.getReturnType());
//        }
//        // 拿到所有成员属性
//        Field[] declaredFields = forName.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println("declaredField:" + declaredField.getName());
//        }
        // 可以使用Java反射技术 可以访问到私有属性
        Field declaredField = forName.getDeclaredField("userId");
        Object obj = forName.newInstance();
        // 允许访问私有成员属性
        declaredField.setAccessible(true);

        declaredField.set(obj, "789");
        UserEntity user = (UserEntity) obj;
        System.out.println(user);

    }
}
