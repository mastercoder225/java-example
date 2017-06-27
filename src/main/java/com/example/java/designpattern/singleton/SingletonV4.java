package com.example.java.designpattern.singleton;

public class SingletonV4 {
    private static SingletonV4 instance;
    static {
        instance = new SingletonV4();
    }

    private SingletonV4() {}

    public static SingletonV4 getInstance() {
        return instance;
    }
}
