package com.example.java.hibernate.validator;

import javax.validation.constraints.NotNull;

public class Car {
    @NotNull
    private String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
