package com.example.java.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class JavaSortedSet {

    public static void main(String[] args) {
        SortedSet<Character> sortedSet = new TreeSet<>();

        // add
        boolean isAdd = sortedSet.add('X');
        boolean isAddAll = sortedSet.addAll(Arrays.asList('A', 'B', 'C'));

        // get
        Character first = sortedSet.first(); // min
        Character last = sortedSet.last(); // max

        // view
        SortedSet<Character> headSetView = sortedSet.headSet('T'); // < T
        SortedSet<Character> tailSetView = sortedSet.tailSet('F'); // >= F
        SortedSet<Character> subSetView = sortedSet.subSet('F', 'T'); // [F, T)

        // remove
        boolean isRemove = sortedSet.remove('X');
        boolean isRemoveAll = sortedSet.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = sortedSet.removeIf(Character::isLowerCase);
        boolean isRetainAll = sortedSet.retainAll(Arrays.asList('A', 'B', 'C'));
        sortedSet.clear();

        // query
        int size = sortedSet.size();
        boolean isEmpty = sortedSet.isEmpty();
        boolean isContains = sortedSet.contains('X');
        boolean isContainsAll = sortedSet.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Comparator<? super Character> comparator = sortedSet.comparator();
        Iterator<Character> iterator = sortedSet.iterator();
        Spliterator<Character> spliterator = sortedSet.spliterator();
        Stream<Character> stream = sortedSet.stream();
        Stream<Character> parallelStream = sortedSet.parallelStream();
        Object[] objects = sortedSet.toArray();
        Character[] characters = sortedSet.toArray(new Character[0]);

        sortedSet.forEach(System.out::println);
    }
}
