package com.example.java.collection;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSortedSet {

    public static void main(String[] args) {
        SortedSet<Character> sortedSet = new TreeSet<>();

        sortedSet.iterator();
        sortedSet.spliterator();
        sortedSet.forEach(System.out::println);

        sortedSet.add('X');
        sortedSet.addAll(Arrays.asList('A', 'B', 'C'));
        sortedSet.remove('X');
        sortedSet.removeAll(Arrays.asList('A', 'B', 'C'));
        sortedSet.removeIf(Character::isDigit);
        sortedSet.retainAll(Arrays.asList('A', 'B', 'C'));
        sortedSet.clear();
        sortedSet.size();
        sortedSet.isEmpty();
        sortedSet.contains('X');
        sortedSet.containsAll(Arrays.asList('A', 'B', 'C'));
        sortedSet.toArray();
        sortedSet.toArray(new Character[10]);
        sortedSet.stream();
        sortedSet.parallelStream();

        sortedSet.first();
        sortedSet.last();
        sortedSet.headSet('X');
        sortedSet.tailSet('X');
        sortedSet.subSet('F', 'T');
        sortedSet.comparator();
    }
}
