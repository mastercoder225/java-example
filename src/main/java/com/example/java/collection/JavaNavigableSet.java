package com.example.java.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class JavaNavigableSet {

    public static void main(String[] args) {
        NavigableSet<Character> navigableSet = new TreeSet<>();

        // add
        boolean isAdd = navigableSet.add('X');
        boolean isAddAll = navigableSet.addAll(Arrays.asList('A', 'B', 'C'));

        // get
        Character first = navigableSet.first(); // min
        Character last = navigableSet.last(); // max
        Character lower = navigableSet.lower('X'); // max value in < X
        Character higher = navigableSet.higher('X'); // min value in > X
        Character floor = navigableSet.floor('X'); // max value in <= X
        Character ceiling = navigableSet.ceiling('X'); // min value in >= X

        // view
        NavigableSet<Character> descendingSetView = navigableSet.descendingSet();
        SortedSet<Character> headSetView1 = navigableSet.headSet('T'); // < T
        NavigableSet<Character> headSetView2 = navigableSet.headSet('T', true); // <= T
        SortedSet<Character> tailSetView1 = navigableSet.tailSet('F'); // >= F
        NavigableSet<Character> tailSetView2 = navigableSet.tailSet('F', false); // > F
        SortedSet<Character> subSetView1 = navigableSet.subSet('F', 'T'); // [F, T)
        NavigableSet<Character> subSetView2 = navigableSet.subSet('F', false, 'T', true); // (F, T]

        // remove
        Character firstCharacter = navigableSet.pollFirst();
        Character lastCharacter = navigableSet.pollLast();
        boolean isRemove = navigableSet.remove('X');
        boolean isRemoveAll = navigableSet.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = navigableSet.removeIf(Character::isLowerCase);
        boolean isRetainAll = navigableSet.retainAll(Arrays.asList('A', 'B', 'C'));
        navigableSet.clear();

        // query
        int size = navigableSet.size();
        boolean isEmpty = navigableSet.isEmpty();
        boolean isContains = navigableSet.contains('X');
        boolean isContainsAll = navigableSet.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Comparator<? super Character> comparator = navigableSet.comparator();
        Iterator<Character> iterator = navigableSet.iterator();
        Iterator<Character> descendingIterator = navigableSet.descendingIterator();
        Spliterator<Character> spliterator = navigableSet.spliterator();
        Stream<Character> stream = navigableSet.stream();
        Stream<Character> parallelStream = navigableSet.parallelStream();
        Object[] objects = navigableSet.toArray();
        Character[] characters = navigableSet.toArray(new Character[0]);

        navigableSet.forEach(System.out::println);
    }
}
