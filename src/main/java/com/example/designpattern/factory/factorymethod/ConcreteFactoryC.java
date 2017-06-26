package com.example.designpattern.factory.factorymethod;

public class ConcreteFactoryC implements Factory {

    @Override
    public Product newProduct() {
        return new ConcreteProductC();
    }
}
