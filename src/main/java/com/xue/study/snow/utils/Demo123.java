package com.xue.study.snow.utils;


import net.sf.json.JSONObject;

public class Demo123 {
    public static void main(String[] args) {
//        try {
//            String str = "123";
//            char c = str.charAt(12);
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        JSONObject jsonObject = JSONObject.fromObject("{}");
        jsonObject.put("key","value");


        System.out.println(jsonObject.isEmpty());
        System.out.println(jsonObject.size()+ jsonObject.get("key").toString());
    }
}
