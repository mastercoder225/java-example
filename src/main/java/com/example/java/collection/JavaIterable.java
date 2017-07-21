package com.example.java.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

public class JavaIterable {

    public static void main(String[] args) {
        Iterable<Character> iterable = Arrays.asList('A', 'B', 'C');

        // transform
        Iterator<Character> iterator = iterable.iterator();
        Spliterator<Character> spliterator = iterable.spliterator();

        iterable.forEach(System.out::println);
    }
}
