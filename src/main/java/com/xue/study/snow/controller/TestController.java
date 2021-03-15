package com.xue.study.snow.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/getDemo")
    @ResponseBody
    public OutputObject testGet() throws JsonProcessingException {
        OutputObject outputObject = new OutputObject();
        return outputObject;

    }
    @GetMapping(value = "/queryAjax")
    public String queryTest(){
        return "Ajax-get.html";
    }

}
