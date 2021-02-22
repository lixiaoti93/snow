package com.xue.study.snow.utils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) throws IOException {
        Workbook wb = new HSSFWorkbook();
        HSSFSheet sheet =((HSSFWorkbook) wb).createSheet("fenjihao");
        FileOutputStream fos =new FileOutputStream("c:\\分机号数据.xls");

        int add =310013000;
        int result=0;
        for(int i=0;i<=2000;i++){
            result=add+i;
            HSSFCell cell =sheet.createRow(i).createCell(0);
            cell.setCellValue(String.valueOf(result));
        }
        ((HSSFWorkbook) wb).write(fos);
        fos.close();
        int a=0;
        int b=1;




    }
}
