package com.wusd;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.通过反射获取Class对象
        Class<?> forName = Class.forName("com.wusd.entity.Student");
        //2.获取注解的信息
        SetTable setTable = forName.getAnnotation(SetTable.class);
        String fromName = setTable.value();

        StringBuffer sb = new StringBuffer();
        sb.append("select ");

        Field[] declaredFields = forName.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //2.获取注解的信息
            SetProperty setProperty = declaredField.getAnnotation(SetProperty.class);
            sb.append(setProperty.name() + ",");
        }
        if (sb.lastIndexOf(",") == sb.length() - 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(" from ");
        sb.append(fromName);
        System.out.println(sb.toString());
    }
}
