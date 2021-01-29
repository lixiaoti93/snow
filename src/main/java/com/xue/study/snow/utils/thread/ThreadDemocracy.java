package com.xue.study.snow.utils.thread;

public class ThreadDemocracy {

    public static void main(String[] args) {
        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("1334");
            }
        };
        Thread a = new Thread(r1);
        a.start();
    }
}
