package com.example.java.algorithm.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class InsertionSort {

    public static SortStatistics insertionSort(int[] a) {
        // statistics
        long compares = 0;
        long swaps = 0;
        long startTime = System.currentTimeMillis();

        for (int i = 1; i < a.length; i++) {
            int marker = a[i];
            int index = i;
            for (int j = index - 1; j >= 0; j--) {
                compares++;
                if (a[j] > marker) {
                    a[j+1] = a[j];
                    index--;
                } else {
                    break;
                }
            }
            a[index] = marker;
        }

        long endTime = System.currentTimeMillis();

        return SortStatistics.builder()
                .name("InsertionSort")
                .size(a.length)
                .compares(compares)
                .swaps(swaps)
                .ops(compares + swaps)
                .secs(TimeUnit.MILLISECONDS.toSeconds(endTime -startTime))
                .build();
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 10000000; i = i * 10) {
            int[] a = IntStream.generate(() -> new Random().nextInt(100)).limit(i).toArray();
            System.out.println(insertionSort(a));
        }
    }


}
