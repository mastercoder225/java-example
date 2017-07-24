package com.example.java.algorithm.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SelectionSort {

    public static SortStatistics selectionSort(int[] a) {
        // statistics
        long compares = 0;
        long swaps = 0;
        long startTime = System.currentTimeMillis();


        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
                compares++;
            }
            if (min != i) {
                SortUtils.swap(a, i, min);
                swaps++;
            }
        }

        long endTime = System.currentTimeMillis();

        return SortStatistics.builder()
                .name("BubbleSort")
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
            System.out.println(selectionSort(a));
        }
    }
}
