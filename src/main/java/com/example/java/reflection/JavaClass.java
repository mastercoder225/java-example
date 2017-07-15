package com.example.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaClass {

    public static void main(String[] args) {
        Class<Integer> clazz = Integer.class;

        // class name
        clazz.getName(); // com.example.java.reflection.JavaClass
        clazz.getSimpleName(); // JavaClass


        // package
        Package p = clazz.getPackage();

        // super class
        Class<?> superClass = clazz.getSuperclass();

        // interface
        Class<?>[] interfaces = clazz.getInterfaces();

        // constructor
        Constructor<?>[] constructors = clazz.getConstructors();

        // method
        Method[] methods = clazz.getMethods();

        // fields
        Field[] fields = clazz.getFields();

        // annotation
        Annotation[] annotations = clazz.getAnnotations();
    }
}
