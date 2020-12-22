package com.xue.study.snow.controller;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.service.IncomeService;
import com.xue.study.snow.utils.JsonUtils;
import jdk.internal.util.xml.impl.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/income")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @RequestMapping(value = "/insertIncome",method = RequestMethod.POST)
    public OutputObject insertIncome(@RequestBody String params) throws Exception {
        Map map =(Map) JsonUtils.transJsonStringToObject(params, Map.class);
        InputObject inputObject = new InputObject();
        OutputObject outputObject = new OutputObject();
        inputObject.setParams(map);
        incomeService.insertIncome(inputObject,outputObject);
        return outputObject;

    }

    /**
     * 查询majiang金额
     * @param params
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryIncome",method = RequestMethod.POST)
    public OutputObject queryIncome(@RequestBody String params) throws Exception {
        InputObject inputObject = new InputObject();
        OutputObject outputObject = new OutputObject();
        Map<String,Object> map =(Map<String, Object>)JsonUtils.transJsonStringToObject(params,Map.class);
        if(null==map){
            map.put("income",null);
            map.put("date",null);
        }
        inputObject.setParams(map);
        incomeService.queryIncome(inputObject,outputObject);
        return outputObject;

    }
    @RequestMapping(value = "/queryCountMoney",method = RequestMethod.GET)
    public OutputObject queryCount(){
        InputObject inputObject = new InputObject();
        OutputObject outputObject = new OutputObject();
        incomeService.queryCount(inputObject,outputObject);
        return outputObject;
    }

}
