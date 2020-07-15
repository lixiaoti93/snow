package com.xue.study.snow.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface HelloDAO {

    void insert(Map map);
}
