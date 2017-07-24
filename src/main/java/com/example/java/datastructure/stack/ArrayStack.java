package com.example.java.datastructure.stack;

public class ArrayStack<E> implements Stack<E> {
    private Object[] elementArray;
    private int top;

    public ArrayStack(int size) {
        elementArray = new Object[size];
        top = -1;
    }

    @Override
    public E push(E element) {
        elementArray[++top] = element;

        return element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        return (E) elementArray[top--];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        return (E) elementArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
