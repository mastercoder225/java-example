package com.example.java.collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class JavaDeque {

    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();

        deque.iterator();
        deque.spliterator();
        deque.forEach(System.out::println);

        deque.add('X');
        deque.addAll(Arrays.asList('A', 'B', 'C'));
        deque.remove('X');
        deque.removeAll(Arrays.asList('A', 'B', 'C'));
        deque.removeIf(Character::isDigit);
        deque.retainAll(Arrays.asList('A', 'B', 'C'));
        deque.clear();
        deque.size();
        deque.isEmpty();
        deque.contains('X');
        deque.containsAll(Arrays.asList('A', 'B', 'C'));
        deque.toArray();
        deque.toArray(new Character[10]);
        deque.stream();
        deque.parallelStream();

        deque.add('X');
        deque.remove();
        deque.element();
        deque.offer('X');
        deque.poll();
        deque.peek();

        deque.addFirst('X');
        deque.removeFirst();
        deque.getFirst();
        deque.offerFirst('X');
        deque.pollFirst();
        deque.peekFirst();
        deque.addLast('X');
        deque.removeLast();
        deque.getLast();
        deque.offerLast('X');
        deque.pollLast();
        deque.peekLast();
        deque.push('X');
        deque.pop();
        deque.removeFirstOccurrence('X');
        deque.removeLastOccurrence('X');
        deque.descendingIterator();
    }
}
