package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;

public class ExcelUtil {
    public static void main(String[] args) throws Exception {
        Workbook wb = new HSSFWorkbook();//创建一个工作蒲
        Sheet hssfSheet = wb.createSheet("li");//创建一个sheet页
        Row row =hssfSheet.createRow(0);//创建一个行
        Cell cell =row.createCell(0);//创建一个单元格 第一列
        cell.setCellValue("李雪兵");//给单元格设置值
        row.createCell(1).setCellValue(1.2);
        row.createCell(2).setCellValue(true);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\POI.xls");
        ((HSSFWorkbook) wb).write(fileOutputStream);
        fileOutputStream.close();


    }

}
