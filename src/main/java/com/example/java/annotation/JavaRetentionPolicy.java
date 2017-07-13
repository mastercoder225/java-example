package com.example.java.annotation;

import java.lang.annotation.RetentionPolicy;

public class JavaRetentionPolicy {

    public static void main(String[] args) {
        RetentionPolicy r1 = RetentionPolicy.SOURCE;
        RetentionPolicy r2 = RetentionPolicy.CLASS;
        RetentionPolicy r3 = RetentionPolicy.RUNTIME;
    }
}
