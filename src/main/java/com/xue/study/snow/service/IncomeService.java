package com.xue.study.snow.service;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;

public interface IncomeService {
    public void insertIncome(InputObject inputObject, OutputObject outputObject);

    /**
     * 查询明细清单
     * @param inputObject
     * @param outputObject
     */
    public void queryIncome(InputObject inputObject,OutputObject outputObject);

    /**
     * 查询打麻将输赢总金额
     * @param inputObject
     * @param outputObject
     */
    public void queryCount(InputObject inputObject,OutputObject outputObject);


}
