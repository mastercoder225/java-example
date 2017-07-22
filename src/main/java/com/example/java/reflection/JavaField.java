package com.example.java.reflection;

import java.lang.reflect.Field;

public class JavaField {

    public static void main(String[] args) throws Exception {
        Class<Integer> clazz = Integer.class;

        // public field
        Field field = clazz.getField("MAX_VALUE");
        Field[] fields = clazz.getFields();

        // public|protected|default|private field
        Field declaredField = clazz.getDeclaredField("MAX_VALUE");
        Field[] declaredFields = clazz.getDeclaredFields();

        Integer maxValue = (Integer) field.get(Integer.class);
    }
}
