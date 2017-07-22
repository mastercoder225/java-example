package com.example.java.reflection;

import lombok.Data;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaClass {

    public static void main(String[] args) throws Exception {
        Class<Integer> clazz = Integer.class;

        // name
        String name = clazz.getName(); // java.lang.Integer
        String simpleName = clazz.getSimpleName(); // Integer
        String canonicalName = clazz.getCanonicalName(); // java.lang.Integer
        String typeName = clazz.getTypeName(); // java.lang.Integer

        // public constructor
        Constructor<Integer> constructor = clazz.getConstructor(String.class);
        Constructor<?>[] constructors = clazz.getConstructors();

        // public|protected|default|private constructor
        Constructor<Integer> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        // public method
        Method method = clazz.getMethod("valueOf", String.class);
        Method[] methods = clazz.getMethods();

        // public|protected|default|private method
        Method declaredMethod = clazz.getDeclaredMethod("valueOf", String.class);
        Method[] declaredMethods = clazz.getDeclaredMethods();

        // public field
        Field field = clazz.getField("MAX_VALUE");
        Field[] fields = clazz.getFields();

        // public|protected|default|private field
        Field declaredField = clazz.getDeclaredField("MAX_VALUE");
        Field[] declaredFields = clazz.getDeclaredFields();

        // annotation
        Annotation[] annotations = clazz.getAnnotations();
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();

        // interface
        Class<?>[] interfaces = clazz.getInterfaces();

        // modifiers
        int modifiers = clazz.getModifiers();

        // package
        Package p = clazz.getPackage();

        // classloader
        ClassLoader classLoader = clazz.getClassLoader();

        boolean isAnnotation = clazz.isAnnotation();
        //boolean isAnnotationPresent = clazz.isAnnotationPresent(Data.class);
        boolean isAnonymousClass = clazz.isAnonymousClass();
        boolean isArray = clazz.isArray();
        boolean isEnum = clazz.isEnum();
        boolean isPrimitive = clazz.isPrimitive();
        boolean isInterface = clazz.isInterface();
        boolean isInstance = clazz.isInstance(new Integer("1"));
        boolean isLocalClass = clazz.isLocalClass();
        boolean isMemberClass = clazz.isMemberClass();
        boolean isAssignableFrom = clazz.isAssignableFrom(Integer.class);
        boolean isSynthetic = clazz.isSynthetic();
    }
}
