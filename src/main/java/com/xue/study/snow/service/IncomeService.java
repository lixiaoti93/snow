package com.xue.study.snow.service;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;

public interface IncomeService {
    public void insertIncome(InputObject inputObject, OutputObject outputObject);
    public void queryIncome(InputObject inputObject,OutputObject outputObject);


}
