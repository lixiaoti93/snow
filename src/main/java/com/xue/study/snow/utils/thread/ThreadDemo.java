package com.xue.study.snow.utils.thread;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        int nu=111111;
        int guess=0;
        long startTime =System.currentTimeMillis();
        while(guess!=nu){
            System.out.println("啥时间停下来");
            guess=(int)(Math.random()*1000000);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("终于停下来,耗时："+(endTime-startTime)+"毫秒");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread.sleep(1000);
        threadDemo.start();
    }
}
