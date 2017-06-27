package com.example.java.designpattern.singleton;

public class SingletonV2 {
    private static SingletonV2 instance;

    private SingletonV2() {}

    public static synchronized SingletonV2 getInstance() {
        if (instance == null) {
            instance = new SingletonV2();
        }

        return instance;
    }
}
