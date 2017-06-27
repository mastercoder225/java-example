package com.example.java.datetime;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriod {

    public static void main(String[] args) {
        Period a = Period.ZERO;
        Period b = Period.ofYears(2);
        Period c = Period.ofMonths(3);
        Period d = Period.ofWeeks(4);
        Period e = Period.ofDays(30);
        Period f = Period.of(2, 3, 30);
        Period g = Period.between(LocalDate.now(), LocalDate.now());
    }

}
