package com.example.java.time;

import java.time.Instant;

public class JavaInstant {

    public static void main(String[] args) {
        Instant a = Instant.now();
        Instant b = Instant.ofEpochMilli(1); // 1970-01-01T00:00:00.001Z
        Instant c = Instant.ofEpochSecond(1); // 1970-01-01T00:00:01Z
        Instant d = Instant.ofEpochSecond(1, 1); // 1970-01-01T00:00:01.000000001Z
        Instant e = Instant.parse("1970-01-01T00:00:00Z"); // 1970-01-01T00:00:00Z
        Instant f = Instant.EPOCH; // 1970-01-01T00:00:00Z
        Instant g = Instant.MAX; // +1000000000-12-31T23:59:59.999999999Z
        Instant h = Instant.MIN; // -1000000000-01-01T00:00:00Z

        Instant instant = Instant.parse("1991-02-25T00:00:00Z");







    }
}
