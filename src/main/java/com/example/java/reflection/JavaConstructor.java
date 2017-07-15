package com.example.java.reflection;

import java.lang.reflect.Constructor;

public class JavaConstructor {

    public static void main(String[] args) throws Exception {
        Class<Integer> clazz = Integer.class;

        // get all constructors
        Constructor<?>[] constructors = clazz.getConstructors();

        // get a specific constructor
        Constructor<Integer> constructor = clazz.getConstructor(String.class);

        // create a new instance using a constructor
        Integer i = constructor.newInstance("100");
    }
}
