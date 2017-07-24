package com.example.java.algorithm.sort;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SortStatistics {
    private String name;
    private long size;
    private long compares;
    private long swaps;
    private long ops;
    private long secs;
}
