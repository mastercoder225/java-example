package com.example.java.designpattern.factory.factorymethod;

public class ConcreteFactoryA implements Factory {

    @Override
    public Product newProduct() {
        return new ConcreteProductA();
    }
}
