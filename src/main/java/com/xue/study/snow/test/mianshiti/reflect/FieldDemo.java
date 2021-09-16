package com.xue.study.snow.test.mianshiti.reflect;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FieldDemo {

    public <T> T mapToObj(Map<String,Object> map,Class<T>clz) throws Exception {
        //通过类对象创建一个实例对象
        T obj = clz.getDeclaredConstructor().newInstance();
        // 获取改对象 中所有的属性
        Field[] fields = clz.getDeclaredFields();
        // 遍历map
        map.forEach((key, value) -> {

            Optional<Field> optional = Arrays.stream(fields).filter(field -> key.equals(field.getName())).findFirst();
            if(optional.isPresent()) {
                Field field = optional.get();
                field.setAccessible(true);
                //设置 值
                try {
                    field.set(obj, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }


            }
        });
        return obj;
    }
    @Test
    public void test1() throws Exception {
        Map<String,Object> maps = new HashMap<>();
        maps.put("name","1234");
        maps.put("password","5464564564");
        User user = mapToObj(maps,User.class);
        System.out.println(user);

    }

    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = User.class;
        User user = (User)cls.getDeclaredConstructor().newInstance();
        user.setName("123");
        Field[] fields = cls.getDeclaredFields();
        for (Field field:fields) {
            String fieldName = field.getName();
            if("name".equals(fieldName)){
                field.setAccessible(true);
               field.set(user,"ceshi");

            }
            System.out.println(field.getName()+field.getModifiers());
            System.out.println(Modifier.isPrivate(field.getModifiers()));
            System.out.println(field.getType());
            field.setAccessible(true);
            System.out.println(field.get(user));
        }
        System.out.println(user);
    }
}
