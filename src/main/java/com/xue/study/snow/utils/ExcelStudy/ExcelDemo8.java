package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * excel 换行
 */
public class ExcelDemo8 {
    public static void main(String[] args) throws IOException {
        //创建工作簿
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet  sheet = hssfWorkbook.createSheet("百里守约");
        //创建row行
        HSSFRow hssfRow = sheet.createRow(0);
        Cell  cell =hssfRow.createCell(2);
        cell.setCellValue("测试\n换行");
        CellStyle cellStyle =hssfWorkbook.createCellStyle();
        //设置可以换行
        cellStyle.setWrapText(true);
        cell.setCellStyle(cellStyle);
        //调整下行的高度
        hssfRow.setHeightInPoints(2*sheet.getDefaultRowHeightInPoints());
        //调整单元格宽度
        sheet.autoSizeColumn(2);
        FileOutputStream fos =new FileOutputStream("c:\\ceshi.xls");
        hssfWorkbook.write(fos);
        fos.close();

    }


}