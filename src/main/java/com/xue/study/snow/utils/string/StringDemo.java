package com.xue.study.snow.utils.string;

public class StringDemo {
    public static void main(String[] args) {
//        String abc = "1234_qwer";
//        String a= abc.substring(abc.indexOf("_")+1);
//        String c= abc.substring(0,abc.indexOf("_"));
//        StringBuilder sb = new StringBuilder(abc);
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb.toString());
//        System.out.println(a);
//        System.out.println(c);
        StringBuilder sb = new StringBuilder();
        sb.append("业务账号：BJT124、BJT234");
//        String result = sb.substring(0,sb.indexOf("：")+1);
        String result = sb.toString();
        System.out.println(result);
        System.out.println(result.lastIndexOf("、"));
    }
}
