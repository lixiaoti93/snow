package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        Workbook wb =new HSSFWorkbook();
        FileOutputStream  fos =new FileOutputStream("C:\\Users\\Administrator\\Desktop\\POI1.xls");
        Sheet sheet = wb.createSheet();//创建sheet页
        Row row =sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(new Date());
        CreationHelper createHelper =wb.getCreationHelper();
        CellStyle cellStyle =wb.createCellStyle();//单元格样式类
        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-mm-dd:hh-mm-ss"));
        cell=row.createCell(1);
        cell.setCellValue(new Date());
        cell.setCellStyle(cellStyle);
        cell=row.createCell(2);
        cell.setCellValue(Calendar.getInstance());
        cell.setCellStyle(cellStyle);

        ((HSSFWorkbook) wb).write(fos);
        fos.close();

    }
}
