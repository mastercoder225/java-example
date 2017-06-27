package com.example.java.designpattern.singleton;

public class SingletonV7 {
    private volatile static SingletonV7 instance;

    private SingletonV7() {}

    public static SingletonV7 getInstance() {
        if (instance == null) {
            synchronized (SingletonV7.class) {
                if (instance == null) {
                    instance = new SingletonV7();
                }
            }
        }

        return instance;
    }
}
