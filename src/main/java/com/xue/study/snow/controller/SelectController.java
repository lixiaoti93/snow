package com.xue.study.snow.controller;

import com.xue.study.snow.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/getUserByName")
    @ResponseBody
    public List getgetUserById1(@RequestParam(value = "username" ) String name)throws Exception{
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("username", name);
        list = selectService.getUserById(map);
        return list;
    }


}
