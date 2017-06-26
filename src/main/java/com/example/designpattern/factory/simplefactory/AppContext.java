package com.example.designpattern.factory.simplefactory;

public class AppContext {

    public static void main(String[] args) {
        Product a1 = SimpleProductFactory.newProduct('A');
        Product b1 = SimpleProductFactory.newProduct('B');
        Product c1 = SimpleProductFactory.newProduct('C');

        Product a2 = SimpleProductFactory.newProductA();
        Product b2 = SimpleProductFactory.newProductB();
        Product c2 = SimpleProductFactory.newProductC();
    }
}
