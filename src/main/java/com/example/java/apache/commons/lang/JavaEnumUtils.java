package com.example.java.apache.commons.lang;

import org.apache.commons.lang3.EnumUtils;

public class JavaEnumUtils {

    public enum HttpMethod {GET, POST, PUT, DELETE}

    public static void main(String[] args) {
        EnumUtils.isValidEnum(HttpMethod.class, "GET"); // true
        EnumUtils.getEnum(HttpMethod.class, "POST"); // POST[ENUM]

    }
}
