package com.example.java.designpattern.builder;

public class AppContext {

    public static void main(String[] args) {
        Component component = Component.builder()
                .addPartA("Part A")
                .addPartB("Part B")
                .addPartC("Part C")
                .build();
        System.out.println(component);
    }
}
