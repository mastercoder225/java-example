package com.example.java.apache.commons.lang.tuple;

import org.apache.commons.lang3.tuple.Triple;

public class JavaTriple {

    private static class Left {
        @Override
        public String toString() {
            return "left";
        }
    }

    private static class Middle {
        @Override
        public String toString() {
            return "middle";
        }
    }

    private static class Right {
        @Override
        public String toString() {
            return "right";
        }
    }

    public static void main(String[] args) {
        Triple<Left, Middle, Right> triple = Triple.of(new Left(), new Middle(), new Right());

        Left left = triple.getLeft();
        Middle middle = triple.getMiddle();
        Right right = triple.getRight();

        String s1 = triple.toString(); // (left,middle,right)
        String s2 = triple.toString("[%1$s,%2$s,%3$s]"); // [left,middle,right]
    }
}
