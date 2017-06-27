package com.example.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterator {
    private static List<Integer> integerList = new ArrayList<>();
    static {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
    }

    public static void main(String[] args) {
        Iterator<Integer> iterator = integerList.iterator();

        boolean hasNext = iterator.hasNext();
        Integer next = iterator.next();
        iterator.remove();
        iterator.forEachRemaining(System.out::println);
    }
}
