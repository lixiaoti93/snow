package com.xue.study.snow.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.service.ExcelService;
import com.xue.study.snow.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/file")
public class ExcelDownController {
    @Autowired
    private ExcelService excelService;

    @RequestMapping(value = "/excelDown", method = RequestMethod.GET)
    public void downExcel(@RequestParam(required = false) String staffId, @RequestParam(required = false) String staffName, HttpServletRequest request, HttpServletResponse response) throws Exception {
        InputObject inputObject = new InputObject();
        Map<String, Object> map = new HashMap<>();
       map.put("staffId",staffId);
       map.put("staffName",staffName);
       inputObject.setParams(map);
        OutputObject outputObject = new OutputObject();
        excelService.exportExcel(inputObject, outputObject, request, response);

    }

}
