package com.example.java.designpattern.factory.simplefactory;

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

    public static Product newProductA() {
        return new ConcreteProductA();
    }

    public static Product newProductB() {
        return new ConcreteProductB();
    }

    public static Product newProductC() {
        return new ConcreteProductC();
    }
}
