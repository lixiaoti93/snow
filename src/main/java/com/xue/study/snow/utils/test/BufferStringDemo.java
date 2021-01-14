package com.xue.study.snow.utils.test;

import java.util.Calendar;
import java.util.Date;

/**
 * 测试BufferString 加字符串效率
 */
public class BufferStringDemo {
    public static void main(String[] args) {
        String str ="";
        long startTime = System.currentTimeMillis();//开始时间
        for (int i=0;i<10000;i++){
            str+=i;

        }
        long endTime =System.currentTimeMillis();
        System.out.println("String耗时"+(endTime-startTime)+"毫秒");
        StringBuffer sb =new StringBuffer("");
        startTime =System.currentTimeMillis();
        for (int j = 0; j <10000 ; j++) {
            sb.append(j);
        }
        endTime=System.currentTimeMillis();
        System.out.println("StringBuffer耗时："+(endTime-startTime)+"毫秒");
        Calendar calendar =Calendar.getInstance();


        while(true){
            System.out.println("do");

        }


    }
}
