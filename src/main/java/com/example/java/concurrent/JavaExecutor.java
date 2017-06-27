package com.example.java.concurrent;

import java.util.concurrent.Executor;

public class JavaExecutor {

    private static class SyncExecutor implements Executor {
        @Override
        public void execute(Runnable command) {
            command.run();
        }
    }

    private static class AsyncExecutor implements Executor {
        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    }

    public static void main(String[] args) throws Exception {
        Executor syncExecutor = new SyncExecutor();
        syncExecutor.execute(() -> System.out.println("Task 1"));
        syncExecutor.execute(() -> System.out.println("Task 2"));
        syncExecutor.execute(() -> System.out.println("Task 3"));
        syncExecutor.execute(() -> System.out.println("Task 4"));
        syncExecutor.execute(() -> System.out.println("Task 5"));

        Executor asyncExecutor = new AsyncExecutor();
        asyncExecutor.execute(() -> System.out.println("Task 1"));
        asyncExecutor.execute(() -> System.out.println("Task 2"));
        asyncExecutor.execute(() -> System.out.println("Task 3"));
        asyncExecutor.execute(() -> System.out.println("Task 4"));
        asyncExecutor.execute(() -> System.out.println("Task 5"));
    }
}
