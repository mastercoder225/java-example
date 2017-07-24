package com.example.java.datastructure.stack;

public class StackExample {

    public static void main(String[] args) {
        // reverse a string
        Stack<Character> stack = new ArrayStack<>(100);

        String input = "This is an awesome string!";
        for (Character c : input.toCharArray()) {
            stack.push(c);
        }

        String output = "";

        while (!stack.isEmpty()) output = output + stack.pop();

        System.out.println(output);

        // case match

    }
}
