package com.example.java.designpattern.factory.factorymethod;

public class ConcreteFactoryC implements Factory {

    @Override
    public Product newProduct() {
        return new ConcreteProductC();
    }
}
