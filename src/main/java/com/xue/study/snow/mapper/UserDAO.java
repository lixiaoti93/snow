package com.xue.study.snow.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDAO {
    List<Map<String,Object>> getUserById(Map map);
    List<Map<String,Object>> queryUserByName(Map map);
}