package com.example.designpattern.singleton;

public class SingletonThreadSafeV1 {
    private static SingletonThreadSafeV1 singletonThreadSafeV1 = null;

    private SingletonThreadSafeV1() {}

    public static synchronized SingletonThreadSafeV1 getInstance() {
        if (singletonThreadSafeV1 == null) {
            return new SingletonThreadSafeV1();
        }

        return singletonThreadSafeV1;
    }
}
