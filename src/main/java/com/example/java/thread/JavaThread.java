package com.example.java.thread;

public class JavaThread {

    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("My thread is running.");
        }
    }

    public static void main(String[] args) {
        new MyThread().start();

    }
}
