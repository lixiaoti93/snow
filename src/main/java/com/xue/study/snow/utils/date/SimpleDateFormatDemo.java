package com.xue.study.snow.utils.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String times = sdf.format(date.getTime()-10*60*1000);
        Date date2 =sdf.parse(times);

        System.out.println(sdf.format(date));
        System.out.println(sdf.format(date2));
        System.out.println(times);
    }
}
