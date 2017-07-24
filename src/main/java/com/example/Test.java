package com.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by zhangjian on 2017/7/24.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(new DecimalFormat("0.##%").format(new BigDecimal("0.01")));
    }
}
