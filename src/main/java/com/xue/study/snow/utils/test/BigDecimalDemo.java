package com.xue.study.snow.utils.test;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal big = new BigDecimal("0.2");
        big.add(new BigDecimal("0.09"));
        System.out.println(big.add(new BigDecimal("0.09")).doubleValue());
    }
}
