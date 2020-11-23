package com.xue.study.snow.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserDAO {
    List<Map<String,Object>> getUserById(Map map);
    List<Map<String,Object>> queryUserByName(Map map);
    List<Map<String,Object>> querySalaryByUsername(Map map);
    int insertIncome(Map map);
    List<Map<String,Object>> queryIncome();
}
