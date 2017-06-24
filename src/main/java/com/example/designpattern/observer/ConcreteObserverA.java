package com.example.designpattern.observer;

public class ConcreteObserverA implements Observer {

    @Override
    public void update() {
        System.out.println("Observer A Updated");
    }
}
