package com.example.java.designpattern.singleton;

public class SingletonV1 {
    private static SingletonV1 instance;

    private SingletonV1() {}

    public static SingletonV1 getInstance() {
        if (instance == null) {
            return new SingletonV1();
        }

        return instance;
    }
}
