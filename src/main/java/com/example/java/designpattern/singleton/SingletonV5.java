package com.example.java.designpattern.singleton;

public class SingletonV5 {
    private static class SingletonHolder {
        private static SingletonV5 instance = new SingletonV5();
    }

    private SingletonV5() {}

    public static SingletonV5 getInstance() {
        return SingletonHolder.instance;
    }
}
