package com.xue.study.snow.bean;

import java.util.List;
import java.util.Map;

public class InputObject {
    private Map params;
    private Object object;
    private List beans;

    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List getBeans() {
        return beans;
    }

    public void setBeans(List beans) {
        this.beans = beans;
    }
}
