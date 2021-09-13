package com.xue.study.snow.test.mianshiti.reflect;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ConstructerDemo {
    public static void main(String[] args) throws Exception {
        //获取user的类对象
        Class<?> cls = User.class;
        //获取user的所有构造方法
        Constructor<?>[] constructors = cls.getConstructors();
        Constructor<?> constructor = constructors[1];
        int number = constructor.getParameterCount();
        System.out.println(number);
        Class<?>[] c = constructor.getParameterTypes();
        for(Class cls1: c){
            System.out.println(cls1.getName());
        }
        //使用构造方法创建对象
        Object o = constructor.newInstance("312312","4qwe");
        User user = (User)o;
//        user.setName("张三");
//        user.setPassword("4124123");
        System.out.println(user);
        User user1 = (User) cls.newInstance();
        User user2  =(User)cls.getDeclaredConstructor().newInstance();

    }
    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<User> cls = User.class;
        //获取有参的构造方法
        Constructor<User> constructor = cls.getDeclaredConstructor(String.class,String.class);
        //
        constructor.setAccessible(true);
        User user = constructor.newInstance("lisi","13");
        System.out.println(user);

    }
}
