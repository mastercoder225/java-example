package com.example.designpattern.strategy;

public class AppContext {
    private static Strategy strategy = new ConcreteStrategyA();

    public static void main(String[] args) {
        strategy.algorithm();

        strategy = new ConcreteStrategyB();
        strategy.algorithm();

        strategy = new ConcreteStrategyC();
        strategy.algorithm();
    }
}
