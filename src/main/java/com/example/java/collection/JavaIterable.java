package com.example.java.collection;

import java.util.Arrays;

public class JavaIterable {

    public static void main(String[] args) {
        Iterable<Character> iterable = Arrays.asList('A', 'B', 'C');

        iterable.iterator();
        iterable.spliterator();
        iterable.forEach(System.out::println);
    }
}
