package com.xue.study.snow.service.impl;

import com.xue.study.snow.mapper.UserDAO;
import com.xue.study.snow.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class SelectServiceImpl implements SelectService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<Map<String, Object>> getUserById (Map map) throws Exception{

        if(null==map.get("username")){
          throw new Exception("查询信息不能为空");
        }
        List<Map<String,Object>> list =new ArrayList<>();
        list =userDAO.getUserById(map);
        return list;
    }
}
