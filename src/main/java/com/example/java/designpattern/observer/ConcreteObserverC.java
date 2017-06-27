package com.example.java.designpattern.observer;

public class ConcreteObserverC implements Observer {

    @Override
    public void update() {
        System.out.println("Observer C Updated");
    }
}
