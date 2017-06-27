package com.example.java.designpattern.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void addedBehavior() {
        System.out.println("Decorator B Added Behavior");
    }

    @Override
    public void behavior() {
        super.behavior();
        addedBehavior();
    }
}
