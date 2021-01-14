package com.xue.study.snow.utils.io;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String[] str ={"123","456","789","22222","888888"};
        File file = new File("text.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            for(int i=0;i<str.length;i++){
                bufferedWriter.write(str[i]);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String s =null;
            int i=0;
            while((s=bufferedReader.readLine())!=null){
                i++;
                System.out.println("第"+i+"行:"+s);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
