package com.xue.study.snow.utils.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ftest extends JFrame implements Serializable {

    private static final long serialVersionUID = 7502335621646021266L;
    private JPanel jContentPane = null;//创建面板对象
    private JTextArea jTextArea = null;//创建文本域对象
    private JPanel controlPanel = null;//创建面板对象
    private JButton openButton = null;//创建按钮对象
    private JButton closeButton = null;//创建按钮对象
    private JButton getOpenButton(){
        if(openButton==null){
            openButton =new JButton();
            openButton.setText("写入文件");//修改按钮的提示信息
            openButton.addActionListener(new ActionListener() {
                //按钮的单击事件
                @Override
                public void actionPerformed(ActionEvent e) {
                    //创建文件对象
                    File file =new File("word.txt");
                    try{
                        //创建FilterWriter对象
                        FileWriter out =new FileWriter(file);
                        //获取文本域中的文件
                        String s=jTextArea.getText();
                        out.write(s);//将信息写入磁盘文件
                        out.close();//

                    }catch (Exception e1){
                        e1.printStackTrace();

                    }
                }
            });

        }
        return openButton;
    }
    private JButton getCloseButton(){
        if(closeButton==null){
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                //按钮的单击事件
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file =new File("word.txt");//创建文件对象
                    try {
                        //创建FileReader 对象
                        FileReader fileReader = new FileReader(file);
                        char[] byt =new char[1024];
                        try {
                            int len =fileReader.read(byt);
                            //设置文本域的显示内容
                            jTextArea.setText(new String(byt,0,len));
                            fileReader.close();//关闭流
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }

                }
            });

        }
        return closeButton;
    }

    public Ftest() throws HeadlessException {
        super();

    }
    private void initialize(){
        this.setSize(300,200);

    }

}
