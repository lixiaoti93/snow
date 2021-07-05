package com.xue.study.snow.utils.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        String dateTime = "2021-07-01 15:40:23.098";
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateTime);
        Map map  = new Hashtable();

        System.out.println(date);
        System.out.println(sdf.format(date));
    }
}
