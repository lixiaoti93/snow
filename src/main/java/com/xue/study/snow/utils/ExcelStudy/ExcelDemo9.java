package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * excel 读取单元格
 */
public class ExcelDemo9 {
    public static void main(String[] args) throws IOException {
        InputStream inp =new FileInputStream("c:\\ceshi.xls");
        POIFSFileSystem fs =new POIFSFileSystem(inp);
        Workbook wb =new HSSFWorkbook(fs);
        Sheet sheet =wb.getSheetAt(0);//获取第一个sheet页
        Row row =sheet.getRow(0);//获取第一行
        Cell cell =row.getCell(0);//获取单元格
        if(cell==null){
            cell=row.createCell(3);
        }
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue("测试单元格");
        FileOutputStream fos =new FileOutputStream("c:\\ceshi.xls");
        wb.write(fos);
        fos.close();
        inp.close();



    }


}