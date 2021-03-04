package com.xue.study.snow.utils.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class MultipleInterfacesProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Cook cook =new CookImpl();
        ClassLoader cl =MultipleInterfacesProxyTest.class.getClassLoader();
        ProxyHandler1  handler1 = new ProxyHandler1(cook);
        //生成代理类型
        Class<?> proxyClass = Proxy.getProxyClass(cl,new Class[]{Cook.class,Driver.class});
        //生成代理对象
        Object proxy =proxyClass.getConstructor(new Class[]{InvocationHandler.class}).newInstance(new Object[]{handler1});
        System.out.println(Proxy.isProxyClass(proxyClass));




    }
}
