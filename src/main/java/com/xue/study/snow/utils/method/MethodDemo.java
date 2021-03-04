package com.xue.study.snow.utils.method;

public class MethodDemo {
    public static void main(String[] args) {
        say("12_3","4_56");
    }
    public static void say(String...args){
        System.out.println(args.length);
        for (String str: args) {
            System.out.println(str.getClass());
        }
    }
}
