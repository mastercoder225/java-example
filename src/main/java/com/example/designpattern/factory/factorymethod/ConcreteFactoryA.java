package com.example.designpattern.factory.factorymethod;

public class ConcreteFactoryA implements Factory {

    @Override
    public Product newProduct() {
        return new ConcreteProductA();
    }
}
