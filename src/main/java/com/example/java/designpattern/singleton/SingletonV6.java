package com.example.java.designpattern.singleton;

public enum SingletonV6 {
    INSTANCE;

    public static SingletonV6 getInstance() {
        return INSTANCE;
    }
}
