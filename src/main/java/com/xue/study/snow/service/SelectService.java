package com.xue.study.snow.service;
import com.xue.study.snow.bean.InputObject;
import com.xue.study.snow.bean.OutputObject;
import jdk.jfr.events.ExceptionThrownEvent;

import java.util.List;
import java.util.Map;

public interface SelectService {

    List<Map<String,Object>> getUserById(Map map)throws Exception;

    public void queryUserByUsername(InputObject inputObject, OutputObject outputObject ) throws Exception;

}
