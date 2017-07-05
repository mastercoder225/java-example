package com.example.java.apache.commons.lang;

import org.apache.commons.lang3.RandomUtils;

public class JavaRandomUtils {

    public static void main(String[] args) {
        RandomUtils.nextInt();        // [0, Integer.MAX_VALUE]
        RandomUtils.nextInt(0, 100);  // [0, 100)
        RandomUtils.nextLong();       // [0, Long.MAX_VALUE]
        RandomUtils.nextLong(0, 100); // [0, 100)
        RandomUtils.nextFloat();      // [0, Float.MAX_VALUE]
        RandomUtils.nextFloat(0, 1);  // [0, 1]
        RandomUtils.nextDouble();     // [0, Double.MAX_VALUE]
        RandomUtils.nextDouble(0, 1); // [0, 1]
        RandomUtils.nextBoolean();    // true|false
        RandomUtils.nextBytes(10);    // byte[10]
    }
}
