package com.xue.study.snow.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)//用于构造方法
@Retention(RetentionPolicy.RUNTIME)//加载到JVM中
public @interface AnonotationDemo {
    String value() default "默认构造方法";
}
