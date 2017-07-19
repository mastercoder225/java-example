package com.example.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JavaCollection {

    public static void main(String[] args) {
        Collection<Character> collection = new ArrayList<>();

        collection.iterator();
        collection.spliterator();
        collection.forEach(System.out::println);

        collection.add('X');
        collection.addAll(Arrays.asList('A', 'B', 'C'));
        collection.remove('X');
        collection.removeAll(Arrays.asList('A', 'B', 'C'));
        collection.removeIf(Character::isDigit);
        collection.retainAll(Arrays.asList('A', 'B', 'C'));
        collection.clear();
        collection.size();
        collection.isEmpty();
        collection.contains('X');
        collection.containsAll(Arrays.asList('A', 'B', 'C'));
        collection.toArray();
        collection.toArray(new Character[10]);
        collection.stream();
        collection.parallelStream();
    }
}
