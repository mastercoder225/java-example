package com.example.java.designpattern.strategy;

public class AppTest {

    public static void main(String[] args) {
        AppContext appContext = new AppContext(new ConcreteStrategyB());
        appContext.applyStrategy();
    }
}
