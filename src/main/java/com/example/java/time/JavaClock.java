package com.example.java.time;

import java.time.Clock;
import java.time.ZoneId;

public class JavaClock {

    public static void main(String[] args) {
        Clock a = Clock.systemUTC();
        Clock b = Clock.systemDefaultZone();

        System.out.println(b.instant().atZone(ZoneId.systemDefault()));

    }
}
