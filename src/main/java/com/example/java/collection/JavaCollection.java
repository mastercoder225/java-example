package com.example.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JavaCollection {

    public static void main(String[] args) {
        Collection<Character> collection = new ArrayList<>();

        collection.size();
        collection.isEmpty();
        collection.contains('X');
        collection.toArray();
        collection.toArray(new Character[10]);
        collection.stream();
        collection.parallelStream();

        collection.add('X');
        collection.remove('X');

        collection.addAll(Arrays.asList('A', 'B', 'C'));
        collection.removeAll(Arrays.asList('A', 'B', 'C'));
        collection.retainAll(Arrays.asList('A', 'B', 'C'));
        collection.containsAll(Arrays.asList('A', 'B', 'C'));
        collection.removeIf(Character::isDigit);
        collection.clear();
    }
}
