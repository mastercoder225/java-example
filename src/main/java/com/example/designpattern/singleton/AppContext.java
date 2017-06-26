package com.example.designpattern.singleton;

public class AppContext {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        SingletonThreadSafeV1 singletonThreadSafeV1 = SingletonThreadSafeV1.getInstance();
        SingletonThreadSafeV2 singletonThreadSafeV2 = SingletonThreadSafeV2.getInstance();
    }
}
