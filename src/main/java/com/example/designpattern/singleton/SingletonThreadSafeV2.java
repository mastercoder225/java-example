package com.example.designpattern.singleton;

public class SingletonThreadSafeV2 {
    private static SingletonThreadSafeV2 singletonThreadSafeV2 = new SingletonThreadSafeV2();

    private SingletonThreadSafeV2() {}

    public static SingletonThreadSafeV2 getInstance() {
        return singletonThreadSafeV2;
    }
}
