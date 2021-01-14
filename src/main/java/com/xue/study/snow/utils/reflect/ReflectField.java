package com.xue.study.snow.utils.reflect;

import java.lang.reflect.Field;

public class ReflectField {
    public int a;
    private long c;
    float fl;
    protected  String str;
    public static void main(String[] args) {
        ReflectField reflectField =new ReflectField();
        Class rf =reflectField.getClass();
        //获得所有成员变量
        Field[] fields =rf.getDeclaredFields();
        for(Field field:fields){
           //获得成员变量名
            System.out.println("成员变量名："+field.getName());
           //获取成员变量类型
            System.out.println("成员变量类型："+field.getType());
        }

    }
}
