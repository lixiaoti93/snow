package com.xue.study.snow.utils.json;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class JSonDemo {
    public static void main(String[] args) {
        String a = "[{}]";
        List<Object>  list = JSON.parseArray(a);
        System.out.println(list.size());
        System.out.println(4|3);
    }
}
