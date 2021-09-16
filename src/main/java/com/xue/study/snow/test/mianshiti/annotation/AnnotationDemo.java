package com.xue.study.snow.test.mianshiti.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 注解   数据类型 支持 8大基本数据类型，String 枚举类  和注解类
 */

/**
 * ElementType.TYPE,ElementType.METHOD
 */
@Target({ElementType.FIELD})
public @interface AnnotationDemo {
    /**
     * 定义成员
     */
    String value();

    /**
     * 定义有默认值的成员
     */
    int abc() default 0;


}
