package com.xue.study.snow.service;

import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;

/**
 *薪水查询
 */
public interface SalaryService {

    public void querySalaryByUsername(InputObject inputObject, OutputObject outputObject)throws Exception;
}
