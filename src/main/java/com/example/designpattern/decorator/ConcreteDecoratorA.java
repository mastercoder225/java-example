package com.example.designpattern.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void addedBehavior() {
        System.out.println("Decorator A Added Behavior");
    }

    @Override
    public void behavior() {
        super.behavior();
        addedBehavior();
    }
}
