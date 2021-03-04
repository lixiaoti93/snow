package com.xue.study.snow.utils.reflect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("注册驱动成功");
            Connection connection = DriverManager.getConnection("","root","19930311");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("注册驱动失败");
            e.printStackTrace();
            return;
        }
    }
}
