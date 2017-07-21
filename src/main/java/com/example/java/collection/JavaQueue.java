package com.example.java.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;
import java.util.stream.Stream;

public class JavaQueue {

    public static void main(String[] args) {
        Queue<Character> queue = new PriorityQueue<>();

        // add
        boolean isAdd = queue.add('X'); // throw exception
        boolean isOffer = queue.offer('X'); // return special value
        boolean isAddAll = queue.addAll(Arrays.asList('A', 'B', 'C'));

        // get
        Character character1 = queue.element(); // throw exception
        Character character2 = queue.peek(); // return special value

        // remove
        Character character4 = queue.remove(); // throw exception
        Character character3 = queue.poll(); // return special value
        boolean isRemove = queue.remove('X');
        boolean isRemoveAll = queue.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = queue.removeIf(Character::isLowerCase);
        boolean isRetainAll = queue.retainAll(Arrays.asList('A', 'B', 'C'));
        queue.clear();

        // query
        int size = queue.size();
        boolean isEmpty = queue.isEmpty();
        boolean contains = queue.contains('X');
        boolean containsAll = queue.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Iterator<Character> iterator = queue.iterator();
        Spliterator<Character> spliterator = queue.spliterator();
        Stream<Character> stream = queue.stream();
        Stream<Character> parallelStream = queue.parallelStream();
        Object[] objects = queue.toArray();
        Character[] characters = queue.toArray(new Character[0]);

        queue.forEach(System.out::println);
    }
}
