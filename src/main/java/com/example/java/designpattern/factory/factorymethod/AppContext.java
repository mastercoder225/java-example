package com.example.java.designpattern.factory.factorymethod;

public class AppContext {
    private static Factory factory;

    public static void main(String[] args) {
        factory = new ConcreteFactoryA();
        Product a = factory.newProduct();

        factory = new ConcreteFactoryB();
        Product b = factory.newProduct();

        factory = new ConcreteFactoryC();
        Product c = factory.newProduct();
    }
}
