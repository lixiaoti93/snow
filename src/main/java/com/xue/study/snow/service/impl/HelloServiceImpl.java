package com.xue.study.snow.service.impl;

import com.xue.study.snow.mapper.HelloDAO;
import com.xue.study.snow.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDAO helloDAO;

    @Override
    public void insertUser(Map map) {
        helloDAO.insert(map);

    }
}
