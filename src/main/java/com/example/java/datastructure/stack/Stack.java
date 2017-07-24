package com.example.java.datastructure.stack;

public interface Stack<E> {

    E push(E element);

    E pop();

    E peek();

    boolean isEmpty();

}
