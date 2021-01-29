package com.xue.study.snow.utils.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ThreadSleepDemo extends JFrame {
    private Thread t;
    //定义颜色数组
    private static Color[]color ={Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,
            Color.ORANGE,Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
    private static final Random rand= new Random();//创建随机对象

    /**
     * 获取随机颜色值
     * @return
     */
    private static Color getColor(){
        return color[rand.nextInt(color.length)];
    }
    public ThreadSleepDemo(){
        t=new Thread(new Runnable() {
            int x=30;
            int y=50;//定义初始坐标
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(100);//县城休眠0.1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取组件绘图上下文对象
                    Graphics graphics =getGraphics();
                    graphics.setColor(getColor());//设置绘图颜色
                    //绘制直线并递增垂直坐标
                    graphics.drawLine(x,y,100,y++);
                    if (y>=80){
                        y=50;
                    }
                }
            }
        });
        t.start();//启动线程
    }
    //初始化程序界面的方法
    public static void init(JFrame jFrame,int width,int height){
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(width,height);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        init(new ThreadSleepDemo(),100,100);
    }

}
