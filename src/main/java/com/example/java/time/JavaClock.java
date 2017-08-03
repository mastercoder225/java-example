package com.example.java.time;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaClock {

    public static void main(String[] args) {
        Clock a = Clock.systemUTC();
        Clock b = Clock.systemDefaultZone();

        System.out.println(ZonedDateTime.now());

    }
}
