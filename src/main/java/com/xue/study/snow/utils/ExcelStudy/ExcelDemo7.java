package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * excel 字体单元格
 */
public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
      //创建工作簿
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet  sheet = hssfWorkbook.createSheet("百里守约");
        //创建row行
        HSSFRow hssfRow = sheet.createRow(0);
        //创建一个字体处理类
        Font font =hssfWorkbook.createFont();
        font.setFontHeightInPoints((short)24);//设置字体大小
        font.setFontName("宋体");//设置字体类型
        font.setItalic(true);//设置斜体
        font.setStrikeout(true);
        CellStyle style =hssfWorkbook.createCellStyle();
        style.setFont(font);
        Cell cell = hssfRow.createCell(1);
        cell.setCellValue("测试字体数据");
        cell.setCellStyle(style);
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\测试字体.xls");
        hssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();
    }


}