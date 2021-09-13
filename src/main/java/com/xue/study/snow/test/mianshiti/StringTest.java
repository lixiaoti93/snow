package com.xue.study.snow.test.mianshiti;

import java.lang.reflect.Field;

public class StringTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "abc";
        //如何在不改变str 的引用的同时，修改str的值为 abcd
        Field field = str.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(str,"abcd".toCharArray());
        System.out.println(str);
    }
}
