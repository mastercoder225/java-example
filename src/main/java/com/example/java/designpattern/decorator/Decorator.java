package com.example.java.designpattern.decorator;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void behavior() {
        component.behavior();
    }
}
