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

        // add
        boolean isAdd = list.add('X');
        list.add(0, 'X');
        boolean isAddAll = list.addAll(Arrays.asList('A', 'B', 'C'));
        boolean isIndexAddAll = list.addAll(0, Arrays.asList('A', 'B', 'C'));

        // get
        Character character = list.get(0);

        // index
        int indexOf = list.indexOf('X');
        int lastIndexOf = list.lastIndexOf('X');

        // view
        List<Character> view = list.subList(0, 0);

        // replace
        Character previousCharacter = list.set(0, 'X');
        list.replaceAll(Character::toLowerCase);

        // sort
        list.sort(Comparator.comparingInt(Character::getNumericValue));

        // remove
        boolean isRemove = list.remove(Character.valueOf('X'));
        Character removedCharacter = list.remove(0);
        boolean isRemoveAll = list.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = list.removeIf(Character::isLowerCase);
        boolean isRetainAll = list.retainAll(Arrays.asList('A', 'B', 'C'));
        list.clear();

        // query
        int size = list.size();
        boolean isEmpty = list.isEmpty();
        boolean isContains = list.contains('X');
        boolean isContainsAll = list.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Iterator<Character> iterator = list.iterator();
        Spliterator<Character> spliterator = list.spliterator();
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> indexListIterator = list.listIterator(0);
        Stream<Character> stream = list.stream();
        Stream<Character> parallelStream = list.parallelStream();
        Object[] objects = list.toArray();
        Character[] characters = list.toArray(new Character[0]);

        list.forEach(System.out::println);
    }
}
