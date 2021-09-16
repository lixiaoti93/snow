package com.xue.study.snow.test.mianshiti.factory;

import com.xue.study.snow.test.mianshiti.annotation.AnnotationDemo1;

import java.lang.reflect.Field;

public class FieldConfig {

    public static <T> T getBean(Class<T> cls) throws Exception {
        T obj = cls.getDeclaredConstructor().newInstance();
        //获取类的所有属性
        Field[] fields = cls.getDeclaredFields();
        //遍历所有的属性
        for(Field field:fields){
            field.setAccessible(true);
            if(field.isAnnotationPresent(AnnotationDemo1.class)){
                //获取 注解
                AnnotationDemo1 anonotationDemo = field.getAnnotation(AnnotationDemo1.class);
                String value = anonotationDemo.value();

                field.set(obj,value);

            }


        }



        return obj;

    }
}
