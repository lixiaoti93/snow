package com.xue.study.snow.utils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook wb =new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("分机号");
        int begin =311301;
        int end =311800;
        int number=311300;
        for(int i=0;i<=end-begin;i++){
            number+=1;
            sheet.createRow(i).createCell(0).setCellValue(String.valueOf(number));

        }
        FileOutputStream fos =new FileOutputStream("c:\\分机号.xls");
        wb.write(fos);
        fos.close();


    }
}
