package com.xue.study.snow.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Mapper
@Component
public interface HelloDAO {

    void insert(Map map);
}
