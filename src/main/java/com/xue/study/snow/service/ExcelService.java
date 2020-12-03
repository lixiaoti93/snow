package com.xue.study.snow.service;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ExcelService {
    public void exportExcel(InputObject inputObject, OutputObject outputObject, HttpServletRequest request,
                             HttpServletResponse response) throws Exception;
    public void queryStaffId(InputObject inputObject, OutputObject outputObject)throws Exception;
}
