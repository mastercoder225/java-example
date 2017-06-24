package com.example.designpattern.factory.simplefactory;

public class AppContext {

    public static void main(String[] args) {
        Product a = ProductFactory.newProduct('A');
        Product b = ProductFactory.newProduct('B');
        Product c = ProductFactory.newProduct('C');
    }
}
