package com.example.java.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class JavaDuration {

    public static void main(String[] args) {
        Duration a = Duration.ZERO;
        Duration b = Duration.ofDays(10);
        Duration c = Duration.ofHours(10);
        Duration d = Duration.ofMinutes(10);
        Duration e = Duration.ofSeconds(10);
        Duration f = Duration.ofSeconds(10, 10);
        Duration g = Duration.ofMillis(10);
        Duration h = Duration.ofNanos(10);
        Duration i = Duration.of(10, ChronoUnit.DAYS);
        Duration j = Duration.of(10, ChronoUnit.HOURS);
        Duration k = Duration.of(10, ChronoUnit.MINUTES);
        Duration l = Duration.of(10, ChronoUnit.SECONDS);
        Duration m = Duration.of(10, ChronoUnit.MILLIS);
        Duration n = Duration.of(10, ChronoUnit.NANOS);
        Duration o = Duration.between(LocalTime.now(), LocalTime.now());
        Duration p = Duration.between(LocalDateTime.now(), LocalDateTime.now());
        Duration q = Duration.between(Instant.now(), Instant.now());
    }
}
