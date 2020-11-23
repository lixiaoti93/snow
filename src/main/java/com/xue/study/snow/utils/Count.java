package com.xue.study.snow.utils;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        int add =308501;
        for(int i=0;i<=2799;i++){
            list.add(add+i);

        }
        System.out.println(list);


    }
}
