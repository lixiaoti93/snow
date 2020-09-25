package com.xue.study.snow.controller;

import com.xue.study.snow.dao.User;
import com.xue.study.snow.service.HelloService;
import com.xue.study.snow.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @Autowired
    private SelectService selectService;

    @RequestMapping("/use")
    public String hello() {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/poem")
    public String poem(){
        return "htmlStudy.html";

    }

    @RequestMapping(value = "/insert")
    public String insert(String username, int age, String phone) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("age", age);
        map.put("phone", phone);

        helloService.insertUser(map);
        return "redirect:/select/getUserByName?username="+map.get("username");
    }
    @ResponseBody
    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public Map log(@RequestBody User user)  throws Exception{
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> maps = new HashMap<String, Object>();
        String username= (String) user.getUsername();
        int age = user.getAge();
        String phone =user.getPhone();
        map.put("username",username);
        map.put("age",age);
        map.put("phone", phone);
        List<Map<String, Object>> list = selectService.getUserById(map);
        if(list.size()>0){
            maps.put("returnCode",0);
            maps.put("returnMessage","该用户名已注册");
            throw new Exception("该用户名已注册");

        }

        helloService.insertUser(map);
        maps.put("returnCode",0);
        maps.put("returnMessage","成功");
        return maps;
    }

}
