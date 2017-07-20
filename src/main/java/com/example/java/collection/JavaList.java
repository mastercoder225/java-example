package com.example.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class JavaList {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        // query operations
        int size = list.size();
        boolean isEmpty = list.isEmpty();
        boolean isContainsX = list.contains('X');
        Iterator<Character> iterator = list.iterator();
        Spliterator<Character> spliterator = list.spliterator();
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> listIteratorAtGivenIndex = list.listIterator(0);
        Stream<Character> stream = list.stream();
        Stream<Character> parallelStream = list.parallelStream();
        Object[] objects = list.toArray();
        Character[] characters = list.toArray(new Character[0]);

        // modification operations
        boolean isAddX = list.add('X');
        boolean isRemoveX = list.remove(Character.valueOf('X'));

        // bulk operations
        boolean isAddAllABC = list.addAll(Arrays.asList('A', 'B', 'C'));
        boolean isAddAllABCAtGivenIndex = list.addAll(0, Arrays.asList('A', 'B', 'C'));
        boolean isRemoveAllABC = list.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRetainAllABC = list.retainAll(Arrays.asList('A', 'B', 'C'));
        boolean isContainsAllABC = list.containsAll(Arrays.asList('A', 'B', 'C'));
        list.replaceAll(Character::toLowerCase);
        list.sort(Comparator.comparingInt(Character::getNumericValue));
        list.clear();

        // positional access operations
        list.add(0, 'X');
        Character characterAtGivenIndex = list.get(0);
        Character previousCharacterAtGivenIndex = list.set(0, 'X');
        Character removedCharacter = list.remove(0);

        // search operations
        int firstIndexOfX = list.indexOf('X');
        int lastIndexOfX = list.lastIndexOf('X');

        // view [from, to)
        List<Character> subListView = list.subList(0, 0);

        list.forEach(System.out::println);
    }
}
