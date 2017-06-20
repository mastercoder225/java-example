package com.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class JavaLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        LocalDateTime b = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDateTime c = LocalDateTime.of(1991, 2, 25, 14, 33);
        LocalDateTime d = LocalDateTime.of(1991, 2, 25, 14, 33, 45);
        LocalDateTime e = LocalDateTime.of(1991, 2, 25, 14, 33, 45, 334);
        LocalDateTime f = LocalDateTime.of(1991, Month.FEBRUARY, 25, 14, 33);
        LocalDateTime g = LocalDateTime.of(1991, Month.FEBRUARY, 25, 14, 33, 45);
        LocalDateTime h = LocalDateTime.of(1991, Month.FEBRUARY, 25, 14, 33, 45, 334);
        LocalDateTime i = LocalDateTime.parse("1991-02-25T14:33:45.334");

        LocalDateTime localDateTime = LocalDateTime.of(1991, Month.FEBRUARY, 25, 14, 33, 45, 334);
        {
            int year = localDateTime.getYear();
            int month = localDateTime.getMonthValue();
            int day = localDateTime.getDayOfMonth();
            int hour = localDateTime.getHour();
            int minute = localDateTime.getMinute();
            int second = localDateTime.getSecond();
            int nano = localDateTime.getNano();
            int dayOfWeek = localDateTime.getDayOfWeek().getValue();
            int dayOfMonth = localDateTime.getDayOfMonth();
            int dayOfYear = localDateTime.getDayOfYear();
        }
        {
            int year = localDateTime.get(ChronoField.YEAR);
            int month = localDateTime.get(ChronoField.MONTH_OF_YEAR);
            int day = localDateTime.get(ChronoField.DAY_OF_MONTH);
            int hour = localDateTime.get(ChronoField.HOUR_OF_DAY);
            int minute = localDateTime.get(ChronoField.MINUTE_OF_HOUR);
            int second = localDateTime.get(ChronoField.SECOND_OF_MINUTE);
            int nano = localDateTime.get(ChronoField.NANO_OF_SECOND);
            int dayOfWeek = localDateTime.get(ChronoField.DAY_OF_WEEK);
            int dayOfMonth = localDateTime.get(ChronoField.DAY_OF_MONTH);
            int dayOfYear = localDateTime.get(ChronoField.DAY_OF_YEAR);
        }




        System.out.println(i);


    }
}
