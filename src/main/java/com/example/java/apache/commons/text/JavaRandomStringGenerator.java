package com.example.java.apache.commons.text;

import org.apache.commons.text.RandomStringGenerator;

public class JavaRandomStringGenerator {

    public static void main(String[] args) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z')
                .build();
        String s = generator.generate(20);
    }
}
