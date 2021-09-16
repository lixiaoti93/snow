package com.xue.study.snow.test.mianshiti.factory;

import com.xue.study.snow.utils.properties.PropUtil;

import java.io.IOException;

public class BeanFactory {
    public static <T> T getBean(String beanKey) throws IOException {
        // 根据beanKey名字获取类名
        String className = PropUtil.getKey(beanKey);
        if(null==className){
            return null;
        }
        try {
            //获取类对象
            Class<?> cls = Class.forName(className);
            //获取无参构造方法，并创建对象
            Object o = cls.getDeclaredConstructor().newInstance();
            return (T)o;
        } catch (Exception e) {
           throw new RuntimeException("加载的类不存在");
        }

    }
}
