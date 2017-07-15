package com.example.java.thread;

public class JavaThread {

    private static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("my thread is running");
        }
    }

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
    }
}
