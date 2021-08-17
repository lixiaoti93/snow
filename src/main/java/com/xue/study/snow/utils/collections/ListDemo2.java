package com.xue.study.snow.utils.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map1 =new HashMap<>();
        map1.put("123","123");
        list.add(map1);
        Map<String,Object> map2 =new HashMap<>();
        map2.put("123","123");
        if(!list.contains(map2)){
            list.add(map2);

        }
        System.out.println(list);
        System.out.println(map1==map2);
    }
}
