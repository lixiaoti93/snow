package com.xue.study.snow.utils.enumDemo;

public class EnumDemo1 {
    public static void main(String[] args) {
        Enum1 e1=Enum1.One;
        Enum1 e2=Enum1.One;
        Enum1 e3=Enum.valueOf(Enum1.class,"One");
        System.out.println(e1==e2);
        System.out.println(e1==e3);

    }
    enum Enum1{
        One,Two,Three,Four
    }
}
