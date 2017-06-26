package com.example.designpattern.singleton;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            return new Singleton();
        }

        return singleton;
    }
}
