package com.example.java.collection.util;

import java.util.Arrays;
import java.util.List;

public class JavaArrays {

    public static void main(String[] args) {
        List<String> a = Arrays.asList("China", "Japan", "Korean");

        String s1 = Arrays.toString(new byte[]{1, 2, 3, 4, 5});
        String s2 = Arrays.toString(new short[]{1, 2, 3, 4, 5});
        String s3 = Arrays.toString(new int[]{1, 2, 3, 4, 5});
        String s4 = Arrays.toString(new long[]{1, 2, 3, 4, 5});
        String s5 = Arrays.toString(new float[]{1.0F, 2.0F, 3.0F, 4.0F, 5.0F});
        String s6 = Arrays.toString(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        String s7 = Arrays.toString(new char[]{'a', 'b', 'c', 'e', 'f'});
        String s8 = Arrays.toString(new boolean[]{true, false});

        byte[] a1 = new byte[5]; // [0, 0, 0, 0, 0]
        short[] a2 = new short[5]; // [0, 0, 0, 0, 0]
        int[] a3 = new int[5]; // [0, 0, 0, 0, 0]
        long[] a4 = new long[5]; // [0, 0, 0, 0, 0]
        float[] a5 = new float[5]; // [0.0, 0.0, 0.0, 0.0, 0.0]
        double[] a6 = new double[5]; // [0.0, 0.0, 0.0, 0.0, 0.0]
        char[] a7 = new char[5]; //
        boolean[] a8 = new boolean[5]; // [false, false, false, false, false]
        // Arrays.fill(a1, 1);





    }
}
