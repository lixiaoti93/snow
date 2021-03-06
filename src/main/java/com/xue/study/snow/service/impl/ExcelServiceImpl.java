package com.xue.study.snow.service.impl;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.mapper.FileDAO;
import com.xue.study.snow.mapper.UserDAO;
import com.xue.study.snow.service.ExcelService;
import com.xue.study.snow.utils.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

@Service
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private FileDAO fileDAO;


    @Override
    public void exportExcel(InputObject inputObject, OutputObject outputObject, HttpServletRequest request, HttpServletResponse response) throws Exception {
        queryStaffId(inputObject,outputObject);
        List<Map<String,Object>> list =outputObject.getBeans();
        Map<String,Object> titleMap =new HashMap<>();
        if(null!=list&&list.size()>0){
            titleMap=list.get(0);
        }
        Set<String> set =titleMap.keySet();
        Iterator<String> iterator =set.iterator();

        //创建一个excel工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        String sheetName = "测试下载文件";
        String excelName="测试下载文件名";
        //创建一个sheet页
        HSSFSheet hssfSheet = workbook.createSheet(sheetName);
        HSSFRow row =hssfSheet.createRow(0);
        //创建单元格样式
        HSSFCellStyle style =workbook.createCellStyle();
        int cellNumber =0;
        //写第一行数据
        while(iterator.hasNext()){
            HSSFCell cell =row.createCell(cellNumber);
            cell.setCellValue(iterator.next());
            cellNumber++;

        }
        //循环写数据
        for(int i=1;i<list.size();i++){
            row =hssfSheet.createRow(i);
            titleMap=list.get(i);
           Collection collection=titleMap.values();
           Iterator<String> iterator1 =collection.iterator();
            int num =0;
            while(iterator1.hasNext()){
                HSSFCell cell =row.createCell(num);
                cell.setCellValue(iterator1.next());
                num++;

            }


        }
        OutputStream outputStream =response.getOutputStream();//获得输出流
        response.reset();//清空输出流
        response.setContentType("application/vnd.ms-excel");
        String headStr ="attachment; filename=\"" + excelName +"\"";
        response.setHeader("Content-Disposition",headStr);
        workbook.write(outputStream);
        outputStream.close();

    }

    /**
     * 根据staffId 和staffName等条件查询信息
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    public void queryStaffId(InputObject inputObject, OutputObject outputObject) throws Exception{
        Map<String,Object> maps = inputObject.getParams();
        String staffId="";
        String staffName="";
        if(null!= maps.get("staffId")){
             staffId =(String)maps.get("staffId");
        }
        if(null!= maps.get("staffName")){
            staffName=(String)maps.get("staffName");
        }

        if(StringUtils.isEmpty(staffId)&&StringUtils.isEmpty(staffName)){
            throw new Exception("staffId 和staffName不能同时为空");
        }
        List<Map<String,Object>> list =userDAO.exportStaffId(maps);
        outputObject.setBeans(list);


    }

    /**
     * 解析读取excel
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @Override
    public void excelImport(InputObject inputObject, OutputObject outputObject) throws Exception {
        FileInputStream fis = (FileInputStream)inputObject.getObject();
        POIFSFileSystem pos = new POIFSFileSystem(fis);
        HSSFWorkbook wb = new HSSFWorkbook(pos);
        HSSFSheet sheet = wb.getSheetAt(0);
        Row row =sheet.getRow(0);
        //获取总行数
        int rowNum =sheet.getLastRowNum();
        //获取某一行的列数
        int cellNum =row.getLastCellNum();
        List<Map<String,Object>> list =new ArrayList<>();
        for(int i=1;i<rowNum;i++){
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
        fileDAO.insertExcel(params);



    }
}
