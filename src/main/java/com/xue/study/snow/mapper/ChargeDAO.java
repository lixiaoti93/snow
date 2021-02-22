package com.xue.study.snow.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 电费如何分配sql
 */
@Mapper
@Component
public interface ChargeDAO {
    int insertDays(Map map);
    List<Map<String,Object>> queryRoomAndMoney(Map map);
}
