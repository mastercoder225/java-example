package com.example.java.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Stream;

public class JavaSet {

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();

        // add
        boolean isAdd = set.add('X');
        boolean isAddAll = set.addAll(Arrays.asList('A', 'B', 'C'));

        // remove
        boolean isRemove = set.remove('X');
        boolean isRemoveAll = set.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = set.removeIf(Character::isLowerCase);
        boolean isRetainAll = set.retainAll(Arrays.asList('A', 'B', 'C'));
        set.clear();

        // query
        int size = set.size();
        boolean isEmpty = set.isEmpty();
        boolean isContains = set.contains('X');
        boolean isContainsAll = set.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Iterator<Character> iterator = set.iterator();
        Spliterator<Character> spliterator = set.spliterator();
        Stream<Character> stream = set.stream();
        Stream<Character> parallelStream = set.parallelStream();
        Object[] objects = set.toArray();
        Character[] characters = set.toArray(new Character[0]);

        set.forEach(System.out::println);
    }
}
