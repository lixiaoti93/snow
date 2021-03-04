package com.xue.study.snow.utils.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类的调用处理类
 */
public class ProxyHandler implements InvocationHandler {
    private Subject subject;

    public ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    /**
     * 此函数在代理对象调用任何一个方法是都会被调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        //定义预处理的工作，可以根据method不同进行不同的预处理工作
        System.out.println("---before---");
        Object result =method.invoke(subject,args);
        System.out.println("---after---");

        return result;
    }
}
