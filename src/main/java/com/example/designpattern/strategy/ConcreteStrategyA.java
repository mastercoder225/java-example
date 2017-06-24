package com.example.designpattern.strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("Apply Strategy A");
    }
}
