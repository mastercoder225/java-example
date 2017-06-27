package com.example.java.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class JavaLocalDate {

    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
//        LocalDate b = LocalDate.of(1991, 2, 25);
//        LocalDate c = LocalDate.of(1991, Month.FEBRUARY, 25);
//        LocalDate d = LocalDate.ofYearDay(1991, 56);
//        LocalDate f = LocalDate.ofEpochDay(7725);
//        LocalDate g = LocalDate.parse("1991-02-25");

        LocalDate localDate = LocalDate.of(1991, Month.FEBRUARY, 25);
        {
            int year = localDate.getYear();
            int month = localDate.getMonthValue();
            int day = localDate.getDayOfMonth();
            int dayOfWeek = localDate.getDayOfWeek().getValue();
            int dayOfMonth = localDate.getDayOfMonth();
            int dayOfYear = localDate.getDayOfYear();
        }
        {
            int year = localDate.get(ChronoField.YEAR);
            int month = localDate.get(ChronoField.MONTH_OF_YEAR);
            int day = localDate.get(ChronoField.DAY_OF_MONTH);
            int dayOfWeek = localDate.get(ChronoField.DAY_OF_WEEK);
            int dayOfMonth = localDate.get(ChronoField.DAY_OF_MONTH);
            int dayOfYear = localDate.get(ChronoField.DAY_OF_YEAR);
        }
        {
        }
    }
}
