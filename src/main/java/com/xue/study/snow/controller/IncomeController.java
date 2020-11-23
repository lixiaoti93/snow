package com.xue.study.snow.controller;



import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.service.IncomeService;
import com.xue.study.snow.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/income")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @RequestMapping(value = "/insertIncome",method = RequestMethod.POST)
    public void insertIncome(@RequestBody String params) throws Exception {
        InputObject inputObject =(InputObject) JsonUtils.transJsonStringToObject(params,InputObject.class);
        OutputObject outputObject = new OutputObject();
        incomeService.insertIncome(inputObject,outputObject);
    }

}
