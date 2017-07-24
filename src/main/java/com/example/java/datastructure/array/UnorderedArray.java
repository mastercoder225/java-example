package com.example.java.datastructure.array;

import java.util.ArrayList;

public class UnorderedArray<E> implements Array<E> {
    private Object[] elementArray;
    private int size;

    public UnorderedArray(int size) {
        elementArray = new Object[size];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E getElement(int index) {
        ArrayList arrayList;
        return (E) elementArray[index];
    }

    @Override
    public void setElement(int index, E element) {
        elementArray[index] = element;
    }
}
