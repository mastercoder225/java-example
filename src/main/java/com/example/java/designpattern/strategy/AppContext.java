package com.example.java.designpattern.strategy;

public class AppContext {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        strategy.apply();
    }
}
