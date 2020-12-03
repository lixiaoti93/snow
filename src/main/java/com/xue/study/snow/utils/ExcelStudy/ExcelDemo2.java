package com.xue.study.snow.utils.ExcelStudy;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        InputStream is =new FileInputStream("C:\\Users\\Administrator\\Desktop\\POI2.xls");
        POIFSFileSystem fs =new POIFSFileSystem(is);
        HSSFWorkbook hwb =new HSSFWorkbook(fs);//创建一个工作簿
        HSSFSheet hssfSheet =hwb.getSheetAt(0);//获取第一个sheet页
        if(hssfSheet==null){
            return;
        }
        //遍历行row
        for(int rowLength =0;rowLength<=hssfSheet.getLastRowNum();rowLength++){
//            System.out.println(hssfSheet.getLastRowNum());
            HSSFRow hssfRow =hssfSheet.getRow(rowLength);
            if(hssfRow==null){
                continue;

            }
            //遍历列cell
            for(int cellNum=0;cellNum<=hssfRow.getLastCellNum();cellNum++){
                HSSFCell hssfCell =hssfRow.getCell(cellNum);
//                System.out.println(cellNum);
                if(hssfCell==null){
                    continue;
                }
                System.out.print(" "+getValue(hssfCell));
            }
            System.out.println();


        }



    }
    private static String getValue(HSSFCell hssfCell){
        if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_STRING){
            return String.valueOf(hssfCell.getStringCellValue());
        }else if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
            return String.valueOf(hssfCell.getBooleanCellValue());
        }else if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC) {
            return String.valueOf(hssfCell.getNumericCellValue());
        }else{
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }
}