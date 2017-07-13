package com.example.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaList {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        // add element
        list.add('A'); // [A]
        list.add('C'); // [A, C]
        list.add(1, 'B'); // [A, B, C]
        list.addAll(Arrays.asList('B', 'A')); // [A, B, C, B, A]
        list.addAll(3, Arrays.asList('D', 'C')); // [A, B, C, D, C, B, A]

        // set element
        list.set(3, 'X'); // [A, B, C, X, C, B, A]

        // get element
        list.get(3); // 'X'

        // get index
        list.indexOf('C'); // 2
        list.indexOf('Z'); // -1
        list.lastIndexOf('C'); // 4
        list.lastIndexOf('Z'); // -1

        // get iterator
        list.iterator();
        list.listIterator();
        list.listIterator(3);

        // contain element
        list.contains('X'); // true
        list.containsAll(Arrays.asList('A', 'C')); // true

        // is empty
        list.isEmpty(); // false

        // size
        list.size();

        // remove
        // replace
        // retain
        // sort
        // sublist
        // toArray


        System.out.println(list.containsAll(Arrays.asList('A', 'C', 'A', null)));








        // clear all elements
        // list.clear();





        System.out.println(list.lastIndexOf('C'));




        System.out.println(list);


























    }
}
