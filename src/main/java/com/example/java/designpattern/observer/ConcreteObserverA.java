package com.example.java.designpattern.observer;

public class ConcreteObserverA implements Observer {

    @Override
    public void update() {
        System.out.println("update observer a");
    }
}
