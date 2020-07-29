package com.xue.study.snow.service;
import java.util.List;
import java.util.Map;

public interface SelectService {

    List<Map<String,Object>> getUserById(Map map)throws Exception;

}
