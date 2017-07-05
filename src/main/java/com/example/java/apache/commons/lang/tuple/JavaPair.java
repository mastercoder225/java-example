package com.example.java.apache.commons.lang.tuple;

import org.apache.commons.lang3.tuple.Pair;

public class JavaPair {

    private static class Left {
        @Override
        public String toString() {
            return "left";
        }
    }

    private static class Right {
        @Override
        public String toString() {
            return "right";
        }
    }

    public static void main(String[] args) {
        Pair<Left, Right> pair = Pair.of(new Left(), new Right());

        Left   left = pair.getLeft();
        Right right = pair.getRight();

        Left    key = pair.getKey();
        Right value = pair.getValue();

        String s1 = pair.toString();              // (left,right)
        String s2 = pair.toString("[%1$s,%2$s]"); // [left,right]
    }
}
