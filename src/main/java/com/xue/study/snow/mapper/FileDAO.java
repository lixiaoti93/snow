package com.xue.study.snow.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Mapper
@Component
public interface FileDAO {
    public int insertExcel(Map map);
}
