package com.xue.study.snow.service.impl;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.mapper.AgeDAO;
import com.xue.study.snow.service.AgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class AgeServiceImpl implements AgeService {
    @Autowired
    private AgeDAO dao;
    @Override
    public void insertAge(InputObject inputObject, OutputObject outputObject) {
        Map<String,Object> params =inputObject.getParams();
        dao.insertAge(params);



    }
}
