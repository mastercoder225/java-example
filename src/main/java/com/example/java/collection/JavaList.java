package com.example.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaList {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        // Iterable
        list.iterator();
        list.spliterator();
        list.forEach(System.out::println);

        // Collection
        list.add('X');
        list.addAll(Arrays.asList('A', 'B', 'C'));
        list.remove(Character.valueOf('X'));
        list.removeAll(Arrays.asList('A', 'B', 'C'));
        list.removeIf(Character::isDigit);
        list.retainAll(Arrays.asList('A', 'B', 'C'));
        list.clear();

        list.size();
        list.isEmpty();
        list.contains('X');
        list.containsAll(Arrays.asList('A', 'B', 'C'));
        list.toArray();
        list.toArray(new Character[10]);
        list.stream();
        list.parallelStream();

        // List
        list.add(0, 'X');
        list.addAll(0, Arrays.asList('A', 'B', 'C'));
        list.get(0);
        list.set(0, 'X');
        list.remove(0);
        //list.replaceAll();
        //list.sort();
        list.subList(0, 10);
        list.indexOf('X');
        list.lastIndexOf('X');
        list.listIterator();
        list.listIterator(0);
    }
}
