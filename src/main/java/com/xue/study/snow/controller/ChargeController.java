package com.xue.study.snow.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.service.ChargeMoneyService;
import com.xue.study.snow.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/charge")
public class ChargeController {
    @Autowired
    private ChargeMoneyService chargeMoneyService;

    @RequestMapping(value = "/queryMoney", method = RequestMethod.POST)
    public OutputObject chargeMoney(@RequestBody String params) throws JsonProcessingException {
        Map map = (Map) JsonUtils.transJsonStringToObject(params, Map.class);
        InputObject inputObject = new InputObject();
        OutputObject outputObject = new OutputObject();
        inputObject.setParams(map);
        chargeMoneyService.queryChargeMoney(inputObject,outputObject);
        return outputObject;

    }

    @RequestMapping(value = "/insertRoomDay", method = RequestMethod.POST)
    public OutputObject insertRoomDay(@RequestBody String params) throws JsonProcessingException {
        Map map = (Map) JsonUtils.transJsonStringToObject(params, Map.class);
        InputObject inputObject = new InputObject();
        OutputObject outputObject = new OutputObject();
        inputObject.setParams(map);
        chargeMoneyService.insertRoomDays(inputObject,outputObject);
        return outputObject;

    }

    @RequestMapping(value = "/computeRoomMoney", method = RequestMethod.POST)
    public OutputObject computeRoomMoney(@RequestBody String params) throws JsonProcessingException {
        Map map = (Map) JsonUtils.transJsonStringToObject(params, Map.class);
        InputObject inputObject = new InputObject();
        OutputObject outputObject = new OutputObject();
        inputObject.setParams(map);
        chargeMoneyService.computeRoomMoney(inputObject,outputObject);
        return outputObject;

    }

}
