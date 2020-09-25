package com.xue.study.snow.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class DrawString extends JFrame {
    private Shape rect;//矩形对象
    private Font font;//字体对象
    private Date date;//当前日期对象
    public DrawString(){
        rect=new Rectangle2D.Double(10,10,200,80);
        font=new Font("宋体",Font.BOLD,16);
        date =new Date();
        this.setSize(230,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasPanel());
        this.setTitle("绘图文本");


    }

    public static void main(String[] args) {
        new DrawString().setVisible(true);

    }
    class CanvasPanel  extends Canvas{
        public void paint(Graphics graphics){
            super.paint(graphics);
            Graphics2D graphics2D =(Graphics2D)graphics;
            graphics2D.setColor(Color.CYAN);//设置当前绘图颜色
            graphics2D.fill(rect);
            graphics2D.setColor(Color.BLUE);
            graphics2D.setFont(font);
            graphics2D.drawString("现在时间是",20,30);
            graphics2D.drawString(String.format("%tr",date),50,60);


        }
    }
}
