package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * excel 读取单元格
 */
public class ExcelDemo11 {
    public static void main(String[] args) throws IOException {
        //创建工作簿
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet  sheet = hssfWorkbook.createSheet("百里守约");
        //创建row行
        HSSFRow hssfRow = sheet.createRow(0);
        hssfRow.createCell(0).setCellValue("测试合并单元格");
        CellRangeAddress region = new CellRangeAddress(0, 1, 0, 5);
        sheet.addMergedRegion(region);
        FileOutputStream fos =new FileOutputStream("c:\\合并单元格.xls");
        hssfWorkbook.write(fos);
        fos.close();



    }


}