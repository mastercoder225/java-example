package com.example.java;

import java.util.Random;

/**
 * Created by zhangjian on 2017/8/11.
 */
public class Test {

    private static int getIndex() {
        double random = new Random().nextDouble();
        if (0.0000 < random && random < 0.1800) return 0;
        if (0.1800 < random && random < 0.2300) return 1;
        if (0.2300 < random && random < 0.4100) return 2;
        if (0.4100 < random && random < 0.4400) return 3;
        if (0.4400 < random && random < 0.4900) return 4;
        if (0.4900 < random && random < 0.5000) return 5;
        if (0.5000 < random && random < 0.5005) return 6;
        if (0.5005 < random && random < 0.5105) return 7;
        if (0.5105 < random && random < 0.5155) return 8;

        return 12;
    }

    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < 10000; i++) {
            a[getIndex()]++;
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.println(a[i]/10000.0 * 100);
        }

    }
}
