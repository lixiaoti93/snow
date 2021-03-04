package com.xue.study.snow.utils.reflect;

public class Son extends Father implements Cloneable,Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        Son son =new Son();
        Class cls =son.getClass();
        Class fa =cls.getSuperclass();
        System.out.println(fa.getName());
        Class[] inter =cls.getInterfaces();
        for(Class a:inter){
            System.out.println(a.getName());
        }

    }
}
class Father{

}