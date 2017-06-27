package com.example.java.designpattern.decorator;

public class ConcreteDecoratorC extends Decorator {

    public ConcreteDecoratorC(Component component) {
        super(component);
    }

    private void addedBehavior() {
        System.out.println("Decorator C Added Behavior");
    }

    @Override
    public void behavior() {
        super.behavior();
        addedBehavior();
    }
}
