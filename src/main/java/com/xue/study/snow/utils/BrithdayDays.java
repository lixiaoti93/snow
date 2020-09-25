package com.xue.study.snow.utils;

import java.util.Scanner;

public class BrithdayDays {
    public static void main(String[] args) {
        BrithdayDays bd = new BrithdayDays();
        System.out.println("输入年份");
        Scanner scan = new Scanner(System.in);

        while (true) {
            String order = String.valueOf(scan.next());
            if("quit".equals(order)){
                break;
            }
            System.out.println(order + "年有" + bd.getDaysOfYear(Integer.valueOf(order)) + "天");
            System.out.println("输入年份");
        }
        System.out.println("流程结束！！");


    }

    private long getDaysOfYear(int year) {
        long days = 0;
        int day = 0;
        for (int i = 1; i <= 12; i++) {
            if (i != 2) {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        day = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        day = 30;
                        break;
                }
            } else {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    //是闰年
                    day = 29;


                } else {
                    //不是闰年
                    day = 28;
                }

            }
            days += day;

        }
        return days;


    }

}
