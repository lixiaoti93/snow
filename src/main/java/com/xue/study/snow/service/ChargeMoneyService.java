package com.xue.study.snow.service;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;

public interface ChargeMoneyService {
    void queryChargeMoney(InputObject inputObject, OutputObject outputObject);
    void insertRoomDays(InputObject inputObject,OutputObject outputObject);
    void computeRoomMoney(InputObject inputObject,OutputObject outputObject);

}
