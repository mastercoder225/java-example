package com.example.java.designpattern.factory.simplefactory;

public class ProductFactory {

    public static Product newProduct(char c) {
        switch (c) {
            case 'a':
                return new ConcreteProductA();
            case 'b':
                return new ConcreteProductB();
            case 'c':
                return new ConcreteProductC();
            default:
                throw new RuntimeException("product type unknown");
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
