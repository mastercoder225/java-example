package com.example.java.designpattern.singleton;

public class SingletonV3 {
    private static SingletonV3 instance = new SingletonV3();

    private SingletonV3() {}

    public static SingletonV3 getInstance() {
        return instance;
    }
}
