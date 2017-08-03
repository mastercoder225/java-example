package com.example.java.time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

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

        Instant instant = Instant.EPOCH;

        Instant p1 = instant.plusNanos(1); // 1970-01-01T00:00:00.000000001Z
        Instant p2 = instant.plusMillis(1); // 1970-01-01T00:00:00.001Z
        Instant p3 = instant.plusSeconds(1); // 1970-01-01T00:00:01Z
        Instant p4 = instant.plus(1, ChronoUnit.NANOS); // 1970-01-01T00:00:00.000000001Z
        Instant p5 = instant.plus(Duration.ofNanos(1)); // 1970-01-01T00:00:00.000000001Z

        Instant m1 = instant.minusNanos(1); // 1969-12-31T23:59:59.999999999Z
        Instant m2 = instant.minusMillis(1); // 1969-12-31T23:59:59.999Z
        Instant m3 = instant.minusSeconds(1); // 1969-12-31T23:59:59Z
        Instant m4 = instant.minus(1, ChronoUnit.NANOS); // 1969-12-31T23:59:59.999999999Z
        Instant m5 = instant.minus(Duration.ofNanos(1)); // 1969-12-31T23:59:59.999999999Z

    }
}
