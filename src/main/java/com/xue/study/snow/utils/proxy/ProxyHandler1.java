package com.xue.study.snow.utils.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 动态代理类的调用处理类
 */
public class ProxyHandler1 implements InvocationHandler {
    private Cook cook;

    public ProxyHandler1(Cook cook) {
        this.cook = cook;
    }

    /**
     * 此函数在代理对象调用任何一个方法是都会被调用
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy类型：" + proxy.getClass().getName());
        System.out.println("调用方法" + method + ":参数为" + Arrays.deepToString(args));
        Object result = method.invoke(cook, args);
        return result;
    }
}
