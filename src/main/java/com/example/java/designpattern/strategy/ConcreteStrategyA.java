package com.example.java.designpattern.strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void apply() {
        System.out.println("apply strategy a");
    }
}
