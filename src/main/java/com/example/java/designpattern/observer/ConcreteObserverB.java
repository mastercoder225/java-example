package com.example.java.designpattern.observer;

public class ConcreteObserverB implements Observer {

    @Override
    public void update() {
        System.out.println("update observer b");
    }
}
