package com.xue.study.snow.utils.proxy;

public class StaticProxyDemo {
    public static void main(String[] args) {
        //创建实际对象
        Subject subject =new SubjectImpl();
        //将实际对象封装到代理对象中
        StaticProxy p =new StaticProxy(subject);
        p.request();
    }
}
