package com.example.java.reflection;

import java.lang.reflect.Modifier;

public class JavaModifier {

    public static void main(String[] args) {
        Class<Integer> clazz = Integer.class;

        int modifiers = clazz.getModifiers();
        Modifier.isPublic(modifiers);
        Modifier.isProtected(modifiers);
        Modifier.isPrivate(modifiers);
        Modifier.isAbstract(modifiers);
        Modifier.isStatic(modifiers);
        Modifier.isFinal(modifiers);
        Modifier.isInterface(modifiers);
        Modifier.isNative(modifiers);
        Modifier.isStrict(modifiers);
        Modifier.isSynchronized(modifiers);
        Modifier.isTransient(modifiers);
        Modifier.isVolatile(modifiers);
    }
}
