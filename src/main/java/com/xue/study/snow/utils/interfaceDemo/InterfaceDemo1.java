package com.xue.study.snow.utils.interfaceDemo;

public interface InterfaceDemo1 {
    public default void say(){
        System.out.println("InterfaceDemo1");
    }
    public static void move(){
        System.out.println("静态方法！！！");
    }
}
