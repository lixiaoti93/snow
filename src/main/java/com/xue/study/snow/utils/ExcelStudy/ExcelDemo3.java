package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * excel 抽取
 */
public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        InputStream is =new FileInputStream("C:\\Users\\Administrator\\Desktop\\POI2.xls");
        POIFSFileSystem fs =new POIFSFileSystem(is);
        HSSFWorkbook hwb =new HSSFWorkbook(fs);
        ExcelExtractor excelExtractor =new ExcelExtractor(hwb);//excel抽取数据
        excelExtractor.setIncludeSheetNames(false);//不需要sheet页名字
        System.out.println(excelExtractor.getText());



    }

}