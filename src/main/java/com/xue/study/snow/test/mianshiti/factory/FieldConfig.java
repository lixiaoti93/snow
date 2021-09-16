package com.xue.study.snow.test.mianshiti.factory;

import com.xue.study.snow.utils.annotation.AnonotationDemo;

import java.lang.reflect.Field;

public class FieldConfig {

    public static <T> T getBean(Class<T> cls) throws Exception {
        T obj = cls.getDeclaredConstructor().newInstance();
        //获取类的所有属性
        Field[] fields = cls.getDeclaredFields();
        //遍历所有的属性
        for(Field field:fields){
            if(field.isAnnotationPresent(AnonotationDemo.class)){
                //获取 注解
                AnonotationDemo anonotationDemo = field.getAnnotation(AnonotationDemo.class);


            }


        }



        return obj;

    }
}
