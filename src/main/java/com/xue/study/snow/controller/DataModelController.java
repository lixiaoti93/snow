package com.xue.study.snow.controller;

import com.xue.study.snow.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/model")
public class DataModelController {
    @Autowired
    private SelectService selectService;


    @GetMapping("/useModel")
    public String useModel(String name, Model model) throws Exception {
        Map<String,Object> map =new HashMap<>();
        map.put("username",name);
        List<Map<String,Object>> list =new ArrayList<>();
        list =selectService.getUserById(map);
        model.addAttribute("list",list);
        return "queryUser.html";
    }

}
