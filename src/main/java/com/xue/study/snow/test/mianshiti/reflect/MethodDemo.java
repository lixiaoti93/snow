package com.xue.study.snow.test.mianshiti.reflect;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MethodDemo {
    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls =User.class;
        Method method = cls.getDeclaredMethod("setName",String.class);
//        for (Method method :
//                methods) {
//            System.out.println(method.getName() + method.getModifiers() +method.getParameterCount());
//            Parameter[] parameters = method.getParameters();
//        }
        Parameter[] parameters = method.getParameters();
        for(Parameter parameter:parameters){
            System.out.println(parameter.getName());
            System.out.println(parameter.getType());

        }
        User  user = new User();
        method.invoke(user,"32423");
        System.out.println(user);
    }
}
