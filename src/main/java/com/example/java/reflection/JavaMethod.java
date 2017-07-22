package com.example.java.reflection;

import java.lang.reflect.Method;

public class JavaMethod {

    public static void main(String[] args) throws Exception {
        Class<Integer> clazz = Integer.class;

        // public method
        Method method = clazz.getMethod("toBinaryString", int.class);
        Method[] methods = clazz.getMethods();

        // public|protected|default|private method
        Method declaredMethod = clazz.getDeclaredMethod("toBinaryString", int.class);
        Method[] declaredMethods = clazz.getDeclaredMethods();

        String binaryString = (String) method.invoke(null, new Integer("100"));

        System.out.println(binaryString);
    }
}
