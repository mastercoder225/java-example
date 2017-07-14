package com.example.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class JavaClass {

    public static void main(String[] args) {
        Class<JavaClass> clazz = JavaClass.class;

        // class name
        clazz.getName(); // com.example.java.reflection.JavaClass
        clazz.getSimpleName(); // JavaClass

        // modifier
        int modifiers = clazz.getModifiers();
        Modifier.isPublic(modifiers);       // true
        Modifier.isProtected(modifiers);    // false
        Modifier.isPrivate(modifiers);      // false
        Modifier.isAbstract(modifiers);     // false
        Modifier.isStatic(modifiers);       // false
        Modifier.isFinal(modifiers);        // false
        Modifier.isInterface(modifiers);    // false
        Modifier.isNative(modifiers);       // false
        Modifier.isStrict(modifiers);       // false
        Modifier.isSynchronized(modifiers); // false
        Modifier.isTransient(modifiers);    // false
        Modifier.isVolatile(modifiers);     // false

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
