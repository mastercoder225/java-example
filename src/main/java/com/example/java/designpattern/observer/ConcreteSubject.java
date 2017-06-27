package com.example.java.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }
}
