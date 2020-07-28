package com.xue.study.snow.controller;

import com.xue.study.snow.dao.User;
import com.xue.study.snow.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/use")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/insert")
    public String insert(String username, int age, String phone) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("age", age);
        map.put("phone", phone);

        helloService.insertUser(map);
        return "注册成功";
    }
    @PostMapping
    @RequestMapping(value = "/log")
    public Map log(@RequestBody User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> maps = new HashMap<String, Object>();
        map.put("username",user.getUsername());
        map.put("age", user.getAge());
        map.put("phone", user.getPhone());
        helloService.insertUser(map);
        maps.put("returnCode",0);
        maps.put("returnMessage","成功");
        return maps;
    }

}
