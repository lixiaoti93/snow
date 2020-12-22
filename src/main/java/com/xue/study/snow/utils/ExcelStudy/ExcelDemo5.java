package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * excel 抽取
 */
public class ExcelDemo5 {
    public static void main(String[] args) throws IOException {
      //创建工作簿
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet  sheet = hssfWorkbook.createSheet("百里守约");
        //创建row行
        HSSFRow hssfRow = sheet.createRow(0);
        //设置行高
        hssfRow.setHeightInPoints(30);
        //生成单元格、
        createCell(hssfWorkbook,hssfRow,(short)0,(short)1,(short)3);

        //设置单元格边框
        Row row2 = sheet.createRow(1);
        Cell cell2= row2.createCell(1);
        cell2.setCellValue("lixiaoti");
        CellStyle cs1 =hssfWorkbook.createCellStyle();
        cs1.setBorderBottom(BorderStyle.valueOf((short)1));//底部边框
        cs1.setBottomBorderColor(IndexedColors.GREEN.getIndex());//底部边框颜色
        cs1.setBorderLeft(BorderStyle.valueOf((short)2));//左侧边框
        cs1.setLeftBorderColor(IndexedColors.RED.getIndex());//左侧边框颜色
        cs1.setBorderRight(BorderStyle.THIN);//右侧边框
        cs1.setRightBorderColor(IndexedColors.YELLOW.getIndex());//右侧边框颜色
        cs1.setBorderTop(BorderStyle.MEDIUM);//顶部边框
        cs1.setTopBorderColor(IndexedColors.BLACK.getIndex());//顶部边框颜色
        cs1.setFillBackgroundColor(IndexedColors.RED.getIndex());//设置单元格背景色
        cs1.setFillForegroundColor(IndexedColors.GREEN.getIndex());//设置单元格前景色
        cs1.setFillPattern(FillPatternType.ALT_BARS);//设置填充方式
        cell2.setCellStyle(cs1);

        FileOutputStream fos =new FileOutputStream("c:\\测试POI4.xls");
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