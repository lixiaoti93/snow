package com.xue.study.snow.utils.test;

import java.lang.reflect.Method;

/**
 * 反向排序
 */
public class SortDemo2 {
    public static void main(String[] args) {
        Object[] o ={"ceshi","rwer","etwe","rew","fds","tewt"};
        SortDemo2 sortDemo2 =new SortDemo2();
        sortDemo2.sort(o);
        Class cl= o.getClass();
        Method[] method =cl.getMethods();
        System.out.println(method);

    }

    public void sort(Object[] obj) {
        int index = obj.length;
        Object o;
        for (int i = 0; i < index / 2; i++) {
            o = obj[i];
            obj[i] = obj[obj.length - 1 - i];
            obj[obj.length - 1 - i] = o;

        }
        show(obj);

    }

    public void show(Object[] obj) {
        for (Object o : obj) {
            System.out.print(o+"   ");
        }

    }
}
