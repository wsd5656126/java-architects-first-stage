package com.wusd;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
//注解作用域
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//注解声明周期
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotation {
    //默认值0
    int beanId() default 0;
    String className() default "";
    String[] arrays();
}
