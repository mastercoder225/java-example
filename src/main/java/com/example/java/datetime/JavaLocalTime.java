package com.example.java.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class JavaLocalTime {

    public static void main(String[] args) {
        LocalTime a = LocalTime.now();
        LocalTime b = LocalTime.of(14, 25);
        LocalTime c = LocalTime.of(14, 25, 33);
        LocalTime d = LocalTime.of(14, 25, 33, 435);
        LocalTime f = LocalTime.ofSecondOfDay(10000);
        LocalTime g = LocalTime.ofNanoOfDay(10000000000000L);
        LocalTime h = LocalTime.parse("14:25:33.435");

        LocalTime localTime = LocalTime.of(14, 25, 33);
        {
            int hour = localTime.getHour();
            int minute = localTime.getMinute();
            int second = localTime.getSecond();
            int nano = localTime.getNano();
        }
        {
            int hour = localTime.get(ChronoField.HOUR_OF_DAY);
            int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
            int second = localTime.get(ChronoField.SECOND_OF_MINUTE);
            int nano = localTime.get(ChronoField.NANO_OF_SECOND);
        }
    }
}
