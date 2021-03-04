package com.xue.study.snow.utils.proxy;
//代理对象
public class StaticProxy implements Subject {
    //实际目标对象
    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void                                                                                                                                                                   request() {
        System.out.println("PreProcess");
        subject.request();
        System.out.println("PostProcess");

    }
}
