package com.xue.study.snow.service.impl;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.mapper.UserDAO;
import com.xue.study.snow.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private UserDAO userDAO;

    /**
     * 插入麻将输赢钱数
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void insertIncome(InputObject inputObject, OutputObject outputObject) {
        Map map = inputObject.getParams();
        Integer integer = userDAO.insertIncome(map);
        if(integer>0){
            outputObject.setReturnCode("0");
            outputObject.setReturnMessage("数据入库成功！！！");
        }else{
            outputObject.setReturnCode("-9999");
            outputObject.setReturnMessage("数据入库失败！！！");

        }
    }

    /**
     * 查询麻将输赢金额清单
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void queryIncome(InputObject inputObject, OutputObject outputObject) {
        Map<String,Object> map =inputObject.getParams();
        List<Map<String,Object>> list =userDAO.queryIncome();
        outputObject.setBeans(list);
    }
    /**
     * 查询打麻将输赢总金额
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void queryCount(InputObject inputObject, OutputObject outputObject) {
        Map<String,Object> maps =new HashMap<>();
        int count=userDAO.queryCount();
        int countMoney=userDAO.queryMoney();
        maps.put("count",count);
        maps.put("countMoney",countMoney);
        outputObject.setBean(maps);
    }
}