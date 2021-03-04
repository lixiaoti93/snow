package com.xue.study.snow.utils.interfaceDemo;

public interface InterfaceDemo extends InterfaceDemo1  {
    public default void say(){
        System.out.println("测试接口方法");
    }
}
