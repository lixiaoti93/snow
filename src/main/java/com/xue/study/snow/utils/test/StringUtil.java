package com.xue.study.snow.utils.test;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    public static void main(String[] args) {
//        String str= (String)null;
//        System.out.println(str);
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        List list2 = new ArrayList();
        list2.add("1");
        list2.add("2");
        List list3 = new ArrayList();
        list3.add("1");
        list3.add("2");
        list.addAll(list2);
        String str ="";
        for(String s :list){
            if(!"".equals(str)){
                str+=",";
            }
            str+=s;
        }
        System.out.println(str);
//        System.out.println(list.size());
//        System.out.println(list.toString());
//        list.removeAll(list3);
//
//        System.out.println(list.size());



//        System.out.println(list.isEmpty());
////
////        System.out.println(false||false||false||true);
    }
}
