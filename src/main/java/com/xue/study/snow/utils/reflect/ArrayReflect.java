package com.xue.study.snow.utils.reflect;

import java.lang.reflect.Array;

public class ArrayReflect {
    public static Object copyArray(Object oldArray,int newLength){
        Class c= oldArray.getClass();
        //获取数组中单个元素的类型个
        Class component =c.getComponentType();
        int oldlength = Array.getLength(oldArray);
        //根据长度创建新数组
        Object newArray =Array.newInstance(component,newLength);
        //拷贝数组
        System.arraycopy(oldArray,0,newArray,0,oldlength);
        return newArray;

    }
    public static void main(String[] args) {
        int[]a ={1,2,3,4,5,6,7,8,5};
        a=(int[])copyArray(a,20);
        for (int c:a) {
            System.out.println(c);
        }

    }
}
