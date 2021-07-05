package com.xue.study.snow.utils.jsonObject;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectDemo {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        Map<String,Object>  map = new HashMap<>();
        map.put("123",123);
        jsonObject.accumulateAll(map);
        System.out.println(jsonObject.size());
        System.out.println(jsonObject.get("123"));
    }
}
