package com.xue.study.snow.utils;

public class StringUtils {

    public static boolean isEmpty(String str){
        if(null==str||""==str){
            return true;
        }else{
            return false;
        }

    }
    public static String getStringValue(Object object){
        if(null!=object){
            return String.valueOf(object);

        }
        return "";
    }
}
