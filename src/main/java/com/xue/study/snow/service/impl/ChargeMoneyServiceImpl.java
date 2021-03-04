package com.xue.study.snow.service.impl;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import com.xue.study.snow.mapper.ChargeDAO;
import com.xue.study.snow.service.ChargeMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
@Service
public class ChargeMoneyServiceImpl implements ChargeMoneyService {
    @Autowired
    private ChargeDAO chargeDAO;

    /**
     * 查询每个房间的金额
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void queryChargeMoney(InputObject inputObject, OutputObject outputObject) {
        Map<String,Object> params =inputObject.getParams();
        List<Map<String,Object>> list = chargeDAO.queryRoomAndMoney(params);
        outputObject.setBeans(list);

    }

    /**
     * 插入每个房间的用电天数
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void insertRoomDays(InputObject inputObject, OutputObject outputObject) {
        Map<String,Object> params =inputObject.getParams();
        chargeDAO.insertDays(params);
    }

    /**
     * 计算每个房间应付的金额,并更新数据库payMoney数据
     * @param inputObject
     * @param outputObject
     */
    @Override
    public void computeRoomMoney(InputObject inputObject, OutputObject outputObject) {
        //先查询出每个房间的天数
        Map<String,Object> params =inputObject.getParams();
        List<Map<String,Object>> list = chargeDAO.queryRoomAndMoney(params);
        //计算出每个房间实际发生的金额数量
        int countDays =0;
        for(Map map:list){
            countDays+=(int)map.get("days");
        }
        BigDecimal b1= new BigDecimal(String.valueOf(countDays));//总天数
        BigDecimal countMoney =(BigDecimal)(list.get(0).get("totalMoney"));//总金额
        BigDecimal dayOfMoney =countMoney.divide(b1,2);
        for(int i=0;i<list.size();i++){
            Map<String,Object> map1=list.get(i);
            map1.put("payMoney",dayOfMoney.multiply(new BigDecimal(String.valueOf(map1.get("days")))));
        }
        chargeDAO.updateChargeMoney(list);

    }

    @Override
    public String charge() {
        return "chargeMoney.html";
    }
}
