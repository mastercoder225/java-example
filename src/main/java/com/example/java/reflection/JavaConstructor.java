package com.example.java.reflection;

import java.lang.reflect.Constructor;

public class JavaConstructor {

    public static void main(String[] args) throws Exception {
        Class<Integer> clazz = Integer.class;

        // public constructor
        Constructor<Integer> constructor = clazz.getConstructor(String.class);
        Constructor<?>[] constructors = clazz.getConstructors();

        // public|protected|default|private constructor
        Constructor<Integer> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        Integer integer = constructor.newInstance("1");


    }
}
