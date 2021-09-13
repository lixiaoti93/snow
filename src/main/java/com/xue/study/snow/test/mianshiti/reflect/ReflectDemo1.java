package com.xue.study.snow.test.mianshiti.reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 类的对象： 类对象
        //类加载：JVM第一次读取一个类的时候，将字节码class文件读入到内存的时候
        // 类对象： 类加载的产物，一个类的类对象永远相同，类对象用Class表示
        //类对象的获取方式有三种
        /**
         * 1.类.class
         * 2.对象的getClass()
         * 3.Class.forName(类的全名)
         */
        Class<String> cls1 = String.class;
        Class<? extends String> cls2 = "xxx".getClass();
        Class<?> cls3 = Class.forName("java.lang.String");
        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);

    }
}
