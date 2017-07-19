package com.example.java.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSet {

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();

        // Iterable
        set.iterator();
        set.spliterator();
        set.forEach(System.out::println);

        // Collection
        set.add('X');
        set.addAll(Arrays.asList('A', 'B', 'C'));
        set.remove('X');
        set.removeAll(Arrays.asList('A', 'B', 'C'));
        set.removeIf(Character::isDigit);
        set.retainAll(Arrays.asList('A', 'B', 'C'));
        set.clear();

        set.size();
        set.isEmpty();
        set.contains('X');
        set.containsAll(Arrays.asList('A', 'B', 'C'));
        set.toArray();
        set.toArray(new Character[10]);
        set.stream();
        set.parallelStream();
    }
}
