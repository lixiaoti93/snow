package com.xue.study.snow.test.mianshiti.reflect;

public class ClassLoaderTest {
    public static void main(String[] args) {
        String s = "123";
        ClassLoader classLoader = s.getClass().getClassLoader();
        System.out.println(classLoader);
    }
}
