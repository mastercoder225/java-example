package com.example.designpattern.factory.factorymethod;

public class AppContext {
    private static Factory factory = new ConcreteFactoryA();

    public static void main(String[] args) {
        Product a = factory.newProduct();

        factory = new ConcreteFactoryB();
        Product b = factory.newProduct();

        factory = new ConcreteFactoryC();
        Product c = factory.newProduct();
    }
}
