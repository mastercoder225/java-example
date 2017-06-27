package com.example.java.designpattern.strategy;

public class AppContext {
    private Strategy strategy;

    public AppContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy() {
        strategy.apply();
    }
}
