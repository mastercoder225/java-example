package com.example.java.collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class JavaDeque {

    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();

        // add
        deque.addFirst('X'); // throw exception
        deque.addLast('X'); // throw exception
        deque.offerFirst('X'); // special value
        deque.offerLast('X'); // special value
        boolean isAdd = deque.add('X'); // throw exception | addLast
        boolean isOffer = deque.offer('X'); // return special value | offerLast
        boolean isAddAll = deque.addAll(Arrays.asList('A', 'B', 'C'));

        // get
        Character character1 = deque.getFirst(); // throws exception
        Character character2 = deque.getLast(); // throws exception
        Character character3 = deque.peekFirst(); // special value
        Character character4 = deque.peekLast(); // special value
        Character character5 = deque.element(); // throw exception | getFirst
        Character character6 = deque.peek(); // special value | peekFirst

        // stack
        deque.push('X'); // addFirst
        Character pop = deque.pop(); // removeFirst
        Character peek = deque.peek(); // peekFirst

        // remove
        Character character7 = deque.removeFirst(); // throws exception
        Character character8 = deque.removeLast(); // throws exception
        Character character9 = deque.pollFirst(); // special value
        Character character10 = deque.pollLast(); // special value
        Character character11 = deque.remove(); // throw exception | removeFirst
        Character character12 = deque.poll(); // special value | pollFirst
        boolean isRemove = deque.remove('X');
        boolean isRemoveFirstOccurrence = deque.removeFirstOccurrence('X');
        boolean isRemoveLastOccurrence = deque.removeLastOccurrence('X');
        boolean isRemoveAll = deque.removeAll(Arrays.asList('A', 'B', 'C'));
        boolean isRemoveIf = deque.removeIf(Character::isLowerCase);
        boolean isRetainAll = deque.retainAll(Arrays.asList('A', 'B', 'C'));
        deque.clear();

        // query
        int size = deque.size();
        boolean isEmpty = deque.isEmpty();
        boolean contains = deque.contains('X');
        boolean containsAll = deque.containsAll(Arrays.asList('A', 'B', 'C'));

        // transform
        Iterator<Character> iterator = deque.iterator();
        Iterator<Character> descendingIterator = deque.descendingIterator();
        Spliterator<Character> spliterator = deque.spliterator();
        Stream<Character> stream = deque.stream();
        Stream<Character> parallelStream = deque.parallelStream();
        Object[] objects = deque.toArray();
        Character[] characters = deque.toArray(new Character[0]);

        deque.forEach(System.out::println);
    }
}
