package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        Workbook wb =new HSSFWorkbook();
        FileOutputStream  fos =new FileOutputStream("C:\\Users\\Administrator\\Desktop\\POI1.xls");
        Sheet sheet = wb.createSheet();
        Row row =sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(new Date());
        ((HSSFWorkbook) wb).write(fos);
        fos.close();

    }
}
