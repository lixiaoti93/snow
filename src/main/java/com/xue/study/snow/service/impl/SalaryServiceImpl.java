package com.xue.study.snow.service.impl;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.mapper.UserDAO;
import com.xue.study.snow.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private UserDAO userDAO;
    /**
     * 根据姓名查询账号工资
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void querySalaryByUsername(InputObject inputObject, OutputObject outputObject) throws Exception{
        Map map =inputObject.getParams();
        if(null==map.get("userName")||""==(String)map.get("userName")){
            throw new Exception("员工姓名不能为空");
        }
        List list = userDAO.querySalaryByUsername(map);
        outputObject.setBeans(list);
    }
}
