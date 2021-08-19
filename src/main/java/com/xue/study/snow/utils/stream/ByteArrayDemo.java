package com.xue.study.snow.utils.stream;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ByteArrayDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bas = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bas);
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("String","string");
        list.add(map);
        oos.writeObject(list);
        byte[] bytes = bas.toByteArray();
        System.out.println(list);
        ByteArrayInputStream bis= new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        List<Map<String,Object>> resultList = (List<Map<String,Object>>)ois.readObject();
        System.out.println(resultList);
        bas.close();
        oos.close();
        bis.close();
        ois.close();




    }
}
