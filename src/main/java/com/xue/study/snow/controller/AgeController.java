package com.xue.study.snow.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.service.AgeService;
import com.xue.study.snow.utils.JsonUtils;
import jdk.internal.util.xml.impl.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/age")
public class AgeController {
    @Autowired
    private AgeService ageService;
    @RequestMapping(value = "/insertAge",method= RequestMethod.POST)
    public OutputObject insertAge(@RequestBody String str) throws JsonProcessingException {
        InputObject inputObject = (InputObject) JsonUtils.transJsonStringToObject(str,InputObject.class);
        OutputObject outputObject = new OutputObject();
        ageService.insertAge(inputObject,outputObject);
        return outputObject;


    }
}
