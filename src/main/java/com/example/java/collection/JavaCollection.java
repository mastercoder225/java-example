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

        // query operations
        int size = collection.size();
        boolean isEmpty = collection.isEmpty();
        boolean isContainsX = collection.contains('X');
        Iterator<Character> iterator = collection.iterator();
        Spliterator<Character> spliterator = collection.spliterator();
        Stream<Character> stream = collection.stream();
        Stream<Character> parallelStream = collection.parallelStream();
        Object[] objects = collection.toArray();
        Character[] characters = collection.toArray(new Character[0]);

        // modification operations
        boolean isAddX = collection.add('X');
        boolean isRemoveX= collection.remove('X');

        // bulk operations
        boolean isAddAllABC = collection.addAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveAllABC = collection.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIfDigit = collection.removeIf(Character::isDigit);
        boolean isRetainAllABC = collection.retainAll(Arrays.asList('A', 'B', 'C'));
        boolean isContainsAllABC = collection.containsAll(Arrays.asList('A', 'B', 'C'));
        collection.clear();

        collection.forEach(System.out::println);
    }
}
