package com.example.java.reflection;

import java.lang.reflect.Constructor;

public class JavaConstructor {

    public JavaConstructor() {}

    public JavaConstructor(String param) {
        System.out.println(param);
    }

    public static void main(String[] args) throws Exception {
        Class<JavaConstructor> clazz = JavaConstructor.class;

        // getting all constructors
        Constructor<?>[] constructors = clazz.getConstructors();

        // getting a specific constructor
        Constructor<JavaConstructor> constructor = clazz.getConstructor(String.class);

        // create new object using constructor object
        JavaConstructor javaConstructor = constructor.newInstance("test");













    }













}
