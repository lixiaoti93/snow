package com.xue.study.snow.utils.proxy;

public class SubjectImpl implements Subject {
    @Override
    public void request() {
        System.out.println("测试代理对象！！！");
    }
}
