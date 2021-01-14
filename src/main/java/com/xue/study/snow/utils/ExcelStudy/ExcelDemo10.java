package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * excel 读取单元格
 */
public class ExcelDemo10 {
    public static void main(String[] args) throws IOException {
        InputStream inp =new FileInputStream("c:\\未分配分机号OP账号数据.xls");
        POIFSFileSystem pos = new POIFSFileSystem(inp);
        HSSFWorkbook wb = new HSSFWorkbook(pos);
        HSSFSheet sheet = wb.getSheetAt(0);
        Row row =sheet.getRow(0);
        //获取总行数
        int rowNum =sheet.getLastRowNum();
        //获取某一行的列数
        int cellNum =row.getLastCellNum();
        List<Map<String,Object>> list =new ArrayList<>();
        for(int i=1;i<=rowNum;i++){
            Row row1 = sheet.getRow(i);
            Map<String,Object> map = new HashMap<>();
            for(int j=0;j<cellNum;j++){
                HSSFCell c1=((HSSFRow) row).getCell(j);
                HSSFCell c2 =((HSSFRow) row1).getCell(j);
                map.put((String) (c1.getStringCellValue()),c2.getStringCellValue());
            }
            list.add(map);


        }
        Map<String,Object> params =new HashMap<>();
        params.put("list",list);
        System.out.println(list);

        inp.close();


    }


}