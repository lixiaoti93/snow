package com.xue.study.snow.utils;

import java.util.Scanner;

public class api {
    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        switch (a) {
            case "1":
                System.out.println("结果是1");
                break;
            case "2":
                System.out.println("结果是2");
                break;
            case "3":
                System.out.println("结果是3");
                break;
            default:
                System.out.println("无有效数字");
        }
    }
}
