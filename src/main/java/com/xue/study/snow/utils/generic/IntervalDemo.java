package com.xue.study.snow.utils.generic;

/**
 * 泛型方法
 */
public class IntervalDemo {
    public static<T> T getMiddle(T...t){
        return t[t.length/2];

    }

    public static void main(String[] args) {
        Long l=IntervalDemo.<Long>getMiddle(133L,456L,12345L,234L,000L);
        String str=IntervalDemo.<String>getMiddle("23","345","23423","gwg");
        System.out.println(l);
        System.out.println(str);
    }
}
