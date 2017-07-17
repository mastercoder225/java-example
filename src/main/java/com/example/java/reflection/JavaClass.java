package com.example.java.reflection;

public class JavaClass {

    public static void main(String[] args) {
        Class<Integer> clazz = Integer.class;

        clazz.toString(); // class java.lang.Integer
        clazz.toGenericString(); // public final class java.lang.Integer

        clazz.getName();
        clazz.getSimpleName();
        clazz.getModifiers();
        clazz.getPackage();
        clazz.getSuperclass();
        clazz.getInterfaces();
        clazz.getConstructors();
        clazz.getFields();
        clazz.getMethods();
        clazz.getAnnotations();

        System.out.println(clazz.toGenericString());
    }
}
