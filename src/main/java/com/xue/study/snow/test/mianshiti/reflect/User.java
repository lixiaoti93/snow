package com.xue.study.snow.test.mianshiti.reflect;

import com.xue.study.snow.test.mianshiti.annotation.AnnotationDemo1;



public class User {
    @AnnotationDemo1(value = "${user}")
    private String name;
    @AnnotationDemo1(value = "123456")
    private String password;

    public User() {
    }

    private User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
