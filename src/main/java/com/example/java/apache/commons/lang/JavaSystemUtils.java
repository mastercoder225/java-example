package com.example.java.apache.commons.lang;

import org.apache.commons.lang3.SystemUtils;

public class JavaSystemUtils {

    public static void main(String[] args) {
        boolean isJava8 = SystemUtils.IS_JAVA_1_8; // IS_JAVA_XXX
        boolean isWindows7 = SystemUtils.IS_OS_WINDOWS_7; // IS_OS_XXX
    }
}
