package com.xue.study.snow.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Object> map =new HashMap<>();
        map.put(null,null);
        map.put("1234",null);
        System.out.println(map);
        Map treeMap =new TreeMap();//TreeMap 不允许键对象是null
        treeMap.put(null,null);
        System.out.println(treeMap);

    }
}
