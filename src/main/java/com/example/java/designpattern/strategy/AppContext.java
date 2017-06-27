package com.example.java.designpattern.strategy;

public class AppContext {
    private static Strategy strategy;

    public static void main(String[] args) {
        strategy = new ConcreteStrategyA();
        strategy.apply();

        strategy = new ConcreteStrategyB();
        strategy.apply();

        strategy = new ConcreteStrategyC();
        strategy.apply();
    }
}
