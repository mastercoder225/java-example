package com.example.java.designpattern.singleton;

public class AppContext {

    public static void main(String[] args) {
        SingletonV1 singleton = SingletonV1.getInstance();

        SingletonV2 singletonV2 = SingletonV2.getInstance();
        SingletonV3 singletonV3 = SingletonV3.getInstance();
    }
}
