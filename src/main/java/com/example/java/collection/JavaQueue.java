package com.example.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {

    public static void main(String[] args) {
        Queue<Character> queue = new PriorityQueue<>();

        queue.iterator();
        queue.spliterator();
        queue.forEach(System.out::println);

        queue.add('X');
        queue.addAll(Arrays.asList('A', 'B', 'C'));
        queue.remove('X');
        queue.removeAll(Arrays.asList('A', 'B', 'C'));
        queue.removeIf(Character::isDigit);
        queue.retainAll(Arrays.asList('A', 'B', 'C'));
        queue.clear();
        queue.size();
        queue.isEmpty();
        queue.contains('X');
        queue.containsAll(Arrays.asList('A', 'B', 'C'));
        queue.toArray();
        queue.toArray(new Character[10]);
        queue.stream();
        queue.parallelStream();

        queue.add('X');
        queue.remove();
        queue.element();
        queue.offer('X');
        queue.poll();
        queue.peek();
    }
}
