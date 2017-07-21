package com.example.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class JavaCollection {

    public static void main(String[] args) {
        Collection<Character> collection = new ArrayList<>();

        // add
        boolean isAdd = collection.add('X');
        boolean isAddAll = collection.addAll(Arrays.asList('A', 'B', 'C'));

        // remove
        boolean isRemove = collection.remove('X');
        boolean isRemoveAll = collection.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = collection.removeIf(Character::isLowerCase);
        boolean isRetainAll = collection.retainAll(Arrays.asList('A', 'B', 'C'));
        collection.clear();

        // query
        int size = collection.size();
        boolean isEmpty = collection.isEmpty();
        boolean contains = collection.contains('X');
        boolean containsAll = collection.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Iterator<Character> iterator = collection.iterator();
        Spliterator<Character> spliterator = collection.spliterator();
        Stream<Character> stream = collection.stream();
        Stream<Character> parallelStream = collection.parallelStream();
        Object[] objects = collection.toArray();
        Character[] characters = collection.toArray(new Character[0]);

        collection.forEach(System.out::println);
    }
}
