package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * excel 抽取
 */
public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        //创建输出流
        FileOutputStream  fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\POI测试.xls");
        //创建工作簿
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet  sheet = hssfWorkbook.createSheet("百里守约");
        //创建row行
        HSSFRow hssfRow = sheet.createRow(0);
        //创建行
        HSSFCell hssfCell =hssfRow.createCell(0);
        hssfCell.setCellValue("信不信");
        hssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();




    }

}