package com.example.java.algorithm.sort;

import java.util.Random;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class BubbleSort {

    public static SortStatistics bubbleSort(int[] a) {
        // statistics
        long compares = 0;
        long swaps = 0;
        long startTime = System.currentTimeMillis();

        int n = a.length; // size:n range[1, n] index[0, n-1]
        // n loops
        for (int loop = 1; loop <= n; loop++) {
            // loop 1: range[1, n]     index[0, n-1] opIndex[0, n-2]
            // loop 2: range[1, n-1]   index[0, n-2] opIndex[0, n-3]
            // loop 3: range[1, n-2]   index[0, n-3] opIndex[0, n-4]
            // ......
            // loop i: range[1, n-i+1] index[0, n-i] opIndex[0, n-i-1]
            for (int index = 0; index <= n - loop - 1; index++) {
                if (a[index] > a[index + 1]) {
                    SortUtils.swap(a, index, index + 1);
                    swaps++;
                }
                compares++;
            }
        }
        long endTime = System.currentTimeMillis();

        return SortStatistics.builder()
                .name("BubbleSort")
                .size(n)
                .compares(compares)
                .swaps(swaps)
                .ops(compares + swaps)
                .secs(TimeUnit.MILLISECONDS.toSeconds(endTime -startTime))
                .build();
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 10000000; i = i * 10) {
            int[] a = IntStream.generate(() -> new Random().nextInt(100)).limit(i).toArray();
            System.out.println(bubbleSort(a));
        }
    }
}
