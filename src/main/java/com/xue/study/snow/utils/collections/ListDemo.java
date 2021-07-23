package com.xue.study.snow.utils.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("234");
        list.add("235");
        list.add("236");
        list.add("237");
        list.add("238");
//        System.out.println(Collections.binarySearch(list,"235"));
        for(Iterator iterator=list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
        Runnable run = new Runnable() {
            @Override
            public void run() {

            }
        };

        Callable call = new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        };

    }
}
