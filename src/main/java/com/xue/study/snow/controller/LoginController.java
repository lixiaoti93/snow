package com.xue.study.snow.controller;

import com.xue.study.snow.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return loginService.login();
    }
    @RequestMapping("/income")
    public String income(){
        return loginService.income();
    }

    @ResponseBody
    @RequestMapping("/sing")
    public Map sing(String name, Integer age) {
        Map map = new HashMap();
        map.put("name", name);
        map.put("age", age);
        return map;


    }

    @GetMapping
    @ResponseBody
    @RequestMapping(value = "/song")
    public List song(@RequestParam("user_name") String username,
                     @RequestParam("AGE") Integer age, @RequestParam(value = "PHONE") String phone){
        List list =new ArrayList();
        list.add(username);
        list.add(age);
        list.add(phone);

        return list;
    }


    @ResponseBody
    @GetMapping
    @RequestMapping(value = "/array")
    public Map array(int[] intArray,String [] name){
        Map map =new HashMap();
        map.put("intArray",intArray);
        map.put("name",name);
        return map;
    }
}
