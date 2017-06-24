package com.example.designpattern.decorator;

public class AppContext {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.behavior();

        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.behavior();

        decorator = new ConcreteDecoratorA(new ConcreteDecoratorB(component));
        decorator.behavior();
    }
}
