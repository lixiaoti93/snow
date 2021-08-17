package com.xue.study.snow.utils.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map =new HashMap<>();
        map.put("bigInt",4345252525526611241L);
        list.add(map);
        System.out.println(list);
    }
}
