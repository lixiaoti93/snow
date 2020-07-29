package com.xue.study.snow.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputObject {
    private String returnCode;
    private String returnMessage;
    private Map<String,Object> bean;
    private List<Map<String,Object>> beans;

    public static interface RTN_CODE{
        public final String SUCCESS ="0";
        public final String ERROR ="-9999";

    }
    public static interface RTN_MSG{
        public final String SUCCESS ="成功";
        public final String ERROR ="失败";
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public Map<String, Object> getBean() {
        if(bean==null){
            bean =new HashMap<>();
        }
        return bean;
    }

    public void setBean(Map<String, Object> bean) {
        this.bean = bean;
    }

    public List<Map<String, Object>> getBeans() {
        if(beans==null){
            beans=new ArrayList<>();
        }
        return beans;
    }

    public void setBeans(List<Map<String, Object>> beans) {
        this.beans = beans;
    }
}
