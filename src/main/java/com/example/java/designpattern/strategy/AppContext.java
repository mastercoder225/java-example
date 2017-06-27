package com.example.java.designpattern.strategy;

public class AppContext {
    private Strategy strategy;

    public AppContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy() {
        strategy.apply();
    }

    public static void main(String[] args) {
        AppContext appContext = new AppContext(new ConcreteStrategyB());
        appContext.applyStrategy();
    }
}
