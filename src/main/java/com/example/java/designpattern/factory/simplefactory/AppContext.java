package com.example.java.designpattern.factory.simplefactory;

public class AppContext {

    public static void main(String[] args) {
        Product a1 = ProductFactory.newProduct('a');
        Product a2 = ProductFactory.newProductA();

        Product b1 = ProductFactory.newProduct('b');
        Product b2 = ProductFactory.newProductB();

        Product c1 = ProductFactory.newProduct('c');
        Product c2 = ProductFactory.newProductC();
    }
}
