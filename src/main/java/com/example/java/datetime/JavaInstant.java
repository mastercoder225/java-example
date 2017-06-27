package com.example.java.datetime;

import java.time.Instant;

public class JavaInstant {

    public static void main(String[] args) {
        Instant a = Instant.now();
        Instant b = Instant.ofEpochSecond(1000000);
        Instant c = Instant.ofEpochSecond(1000000, 100);
        Instant d = Instant.ofEpochMilli(1000000);
    }
}
