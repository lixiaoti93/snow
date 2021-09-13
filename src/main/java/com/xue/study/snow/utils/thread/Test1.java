package com.xue.study.snow.utils.thread;


import com.xue.study.snow.utils.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("staffId","123");
        map.put("provinceId","0001");
        map.put("origStaffId","gonghao123");
        map.put("systemNo","crm");
        map.put("serviceTypeId","123");
        map.put("CITY_ID","123");
        map.put("chnlId","123");
        Map<String,Object> map2 = new HashMap<>();
        map2.put("staffId","123");
        map2.put("provinceId","0002");
        map2.put("origStaffId","gonghao125");
        map2.put("systemNo","boss");
        map2.put("serviceTypeId","123");
        map2.put("CITY_ID","123");
        map2.put("chnlId","123");
        list.add(map);
        list.add(map2);
        Map<String,Object> params = new HashMap<>();
        params.put("provinceId","0001");
        params.put("staffId","123");
        String provinceId = StringUtils.getStringValue(params.get("provinceId")) ;
        String origStaffId = (String)params.get("origStaffId");
        String systemNo = "CRM";
        List<Map<String,Object>> resultList = new ArrayList<>();
        for(Map<String,Object> m :list){
            if(!StringUtils.isEmpty(provinceId)){
                String provinceId1 =StringUtils.getStringValue(m.get("provinceId"));
                if(!provinceId.equals(provinceId1)){
                    //不符合条件的数据
                    continue;
                }
            }
            if(!StringUtils.isEmpty(origStaffId)){
                String origStaffId1 =StringUtils.getStringValue(m.get("origStaffId"));
                if(!origStaffId.equals(origStaffId1)){
                    //不符合条件的数据
                    continue;
                }
            }
            if(!StringUtils.isEmpty(systemNo)){
                String systemNo1 =StringUtils.getStringValue(m.get("systemNo"));
                if(!systemNo.equals(systemNo1)){
                    //不符合条件的数据
                    continue;
                }
            }
            resultList.add(m);
        }
        System.out.println(resultList);
    }
}
