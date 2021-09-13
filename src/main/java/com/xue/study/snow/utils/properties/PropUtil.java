package com.xue.study.snow.utils.properties;

import java.io.*;
import java.util.Properties;

public class PropUtil {
    public static String getKey(String key) throws IOException {
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Program Files\\work\\ideaProgram\\snow\\src\\main\\resources\\application.properties"));
        properties.load(bufferedReader);
       // 获取key对应的value值
         return properties.getProperty( key);
    }
}
