package com.xue.study.snow.utils.generic;

public class Interval<T> {
    private T t1;
    private T t2;

    public Interval(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }
    
}
