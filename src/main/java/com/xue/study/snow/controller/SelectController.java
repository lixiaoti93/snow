package com.xue.study.snow.controller;

import com.xue.study.snow.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/select")
public class SelectController {
    @Autowired
    private SelectService selectService;

    @GetMapping("/{str}")
    public List getUserById(@PathVariable("str") String str) throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("username", str);
        list = selectService.getUserById(map);
        return list;

    }


}
