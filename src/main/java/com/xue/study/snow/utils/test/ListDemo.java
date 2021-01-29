package com.xue.study.snow.utils.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo {
    public static void main(String[] args) {
        Map map =new HashMap();
        List<String> list  =new ArrayList<>();
        map.put("list",list);
        list.add("123");
        list.retainAll(list);
        System.out.println(map);
    }
}
