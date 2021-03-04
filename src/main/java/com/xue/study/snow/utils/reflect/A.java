package com.xue.study.snow.utils.reflect;

public class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void suy(){
        System.out.println("Hello from B");

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A a=new A();
        a.suy();
        A a1=(A)a.clone();
        a1.suy();
    }
}
