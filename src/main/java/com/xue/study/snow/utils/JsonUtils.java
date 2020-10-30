package com.xue.study.snow.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    private static ObjectMapper objectMapper;
    static{
        objectMapper =new ObjectMapper();
    }

    /**
     * 转换json 数据为Object对象
     * @param json
     * @param cls
     * @return
     * @throws JsonProcessingException
     */
    public static Object transJsonStringToObject(String json,Class cls) throws JsonProcessingException {
        return objectMapper.readValue(json,cls);
    }

    public static String transObjectToJsonString(Class cls){
        try {
            return objectMapper.writeValueAsString(cls);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
