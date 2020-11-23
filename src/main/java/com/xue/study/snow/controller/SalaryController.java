package com.xue.study.snow.controller;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.service.SalaryService;
import com.xue.study.snow.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/salary")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @PostMapping(value = "/querySalary")
    public OutputObject querySalary( @RequestBody String params) throws Exception {
        InputObject inputObject = (InputObject) JsonUtils.transJsonStringToObject(params,InputObject.class);
        OutputObject outputObject =new OutputObject();
        salaryService.querySalaryByUsername(inputObject,outputObject);
        System.out.println("测试热部署！！！");
        System.out.println("热部署生效了吗？？？");
        System.out.println("生效了");
        return outputObject;
    }

}
