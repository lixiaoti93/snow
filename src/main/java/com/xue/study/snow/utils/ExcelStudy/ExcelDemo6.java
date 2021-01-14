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
 * excel 单元格合并
 */
public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
      //创建工作簿
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet  sheet = hssfWorkbook.createSheet("百里守约");
        //创建row行
        HSSFRow hssfRow = sheet.createRow(0);
        Cell cell =hssfRow.createCell(0);
        cell.setCellValue("测试单元格合并");
        sheet.addMergedRegion(new CellRangeAddress(
                0,//起始行
                1,//结束行
                0,//起始列
                5));//结束列

        FileOutputStream fos =new FileOutputStream("c:\\测试单元格合并.xls");
        hssfWorkbook.write(fos);
        fos.close();





    }

    /**
     * 创建一个单元格并为其设置指定的对齐方式
     * @param workbook 工作簿
     * @param row 行
     * @param column 列
     * @param halign 水平方向对其方式
     * @param valign 垂直方向对其方式
     */
    private static void createCell(Workbook workbook, Row row,short column,short halign,short valign){
        Cell cell =row.createCell(column);
        cell.setCellValue(new HSSFRichTextString("Align It"));//设置值
        CellStyle cellStyle =workbook.createCellStyle();//创建单元格样式
        cellStyle.setAlignment(HorizontalAlignment.forInt(halign));//设置单元格水平样式对齐方式
        cellStyle.setVerticalAlignment(VerticalAlignment.forInt(valign));//设置单元格垂直方向对齐方式
        cell.setCellStyle(cellStyle);//设置单元格样式


    }

}