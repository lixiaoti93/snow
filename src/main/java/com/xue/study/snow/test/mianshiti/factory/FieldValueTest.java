package com.xue.study.snow.test.mianshiti.factory;

import com.xue.study.snow.test.mianshiti.reflect.User;

public class FieldValueTest {
    public static void main(String[] args) throws Exception {
        User user = FieldConfig.getBean(User.class);
        System.out.println(user);

    }
}
