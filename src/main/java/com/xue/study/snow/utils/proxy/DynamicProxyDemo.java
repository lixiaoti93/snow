package com.xue.study.snow.utils.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        //1 创建目标对象
        SubjectImpl realSubject =new SubjectImpl();
        //2 创建调用处理器对象
        ProxyHandler handler =new ProxyHandler(realSubject);
        //3 动态生成代理对象
        Subject proxySubject =(Subject) Proxy.newProxyInstance(SubjectImpl.class.getClassLoader(),
                 SubjectImpl.class.getInterfaces(),
                handler);
        //4 客户端通过代理对象调用方法
        //本地调用将自动被代理处理器的invoke 方法接收
        proxySubject.request();
        System.out.println(proxySubject.getClass().getName());
    }
}
