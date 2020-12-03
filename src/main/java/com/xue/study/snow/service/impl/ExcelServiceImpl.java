package com.xue.study.snow.service.impl;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.mapper.UserDAO;
import com.xue.study.snow.service.ExcelService;
import com.xue.study.snow.utils.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

@Service
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    private UserDAO userDAO;
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
        int cellNumber =0;
        while(iterator.hasNext()){

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
        String staffId =String.valueOf(maps.get("staffId"));
        String staffName =String.valueOf(maps.get("staffName"));
        if(StringUtils.isEmpty(staffId)&&StringUtils.isEmpty(staffName)){
            throw new Exception("staffId 和staffName不能同时为空");
        }
        List<Map<String,Object>> list =userDAO.exportStaffId(maps);
        outputObject.setBeans(list);


    }
}
