package com.example.designpattern.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void behavior() {
        System.out.println("Component Behavior");
    }
}
