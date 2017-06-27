package com.example.java.designpattern.observer;

public class AppContext {
    private static Subject subject = new ConcreteSubject();

    private static Observer observerA = new ConcreteObserverA();
    private static Observer observerB = new ConcreteObserverB();
    private static Observer observerC = new ConcreteObserverC();

    public static void main(String[] args) {
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.registerObserver(observerC);
        subject.notifyAllObservers();

        subject.removeObserver(observerA);
        subject.removeObserver(observerC);
        subject.notifyAllObservers();
    }
}
