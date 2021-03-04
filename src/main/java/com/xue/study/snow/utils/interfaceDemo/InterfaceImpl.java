package com.xue.study.snow.utils.interfaceDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InterfaceImpl implements InterfaceDemo{


    public static void main(String[] args) {
        InterfaceImpl inter =new InterfaceImpl();
        inter.say();
        try {
            FileOutputStream fileOutputStream =new FileOutputStream("123.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
