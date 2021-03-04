package com.xue.study.snow.utils.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public ReflectDemo() {
    }
    public void say(){
        System.out.println("加载要写上包名");

    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object o=Class.forName("com.xue.study.snow.utils.reflect.ReflectDemo").newInstance();
        Method method =Class.forName("com.xue.study.snow.utils.reflect.ReflectDemo").getMethod("say");
        method.invoke(o);
    }
}
