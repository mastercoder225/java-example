package com.example.java.designpattern.factory.factorymethod;

public class ConcreteFactoryB implements Factory {

    @Override
    public Product newProduct() {
        return new ConcreteProductB();
    }
}
