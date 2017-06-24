package com.example.designpattern.factory.simplefactory;

public class AppContext {

    public static void main(String[] args) {
        Product a = SimpleProductFactory.newProduct('A');
        Product b = SimpleProductFactory.newProduct('B');
        Product c = SimpleProductFactory.newProduct('C');
    }
}
