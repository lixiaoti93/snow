package com.xue.study.snow.utils.collections;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.study.snow.utils.JsonUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo4 {
    public static void main(String[] args) throws JsonProcessingException {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map1 =new HashMap<>();
        Map<String,Object> map =new HashMap<>();
        map.put("123",123);
        list.add(map);
        map1.put("list",list);
        String json = JsonUtils.transObjectToJsonString(list);
        System.out.println(json);
        List<Map<String,Object>> list2= (List<Map<String,Object>>)JsonUtils.transJsonStringToObject(json,List.class);
        map1.put("list",list2);
        map.put("345",345);
        System.out.println(map1);
    }
}
