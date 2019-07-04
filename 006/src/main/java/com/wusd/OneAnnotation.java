package com.wusd;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotation {
    int beanId() default 0;
    String className() default "";
    String[] arrays();
}
