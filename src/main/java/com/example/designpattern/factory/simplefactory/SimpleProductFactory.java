package com.example.designpattern.factory.simplefactory;

public class SimpleProductFactory {

    public static Product newProduct(char c) {
        switch (c) {
            case 'A':
                return new ConcreteProductA();
            case 'B':
                return new ConcreteProductB();
            case 'C':
                return new ConcreteProductC();
            default:
                throw new RuntimeException("Unknown Product Type");
        }
    }
}
