package com.example.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class JavaExecutors {

    public static void main(String[] args) {
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        ExecutorService es2 = Executors.newSingleThreadExecutor(Thread::new);

        ExecutorService es3 = Executors.newFixedThreadPool(10);
        ExecutorService es4 = Executors.newFixedThreadPool(10, Thread::new);

        ExecutorService es5  = Executors.newCachedThreadPool();
        ExecutorService es6  = Executors.newCachedThreadPool(Thread::new);

        ScheduledExecutorService ses1 = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService ses2 = Executors.newSingleThreadScheduledExecutor(Thread::new);
        ScheduledExecutorService ses3 = Executors.newScheduledThreadPool(10);
        ScheduledExecutorService ses4 = Executors.newScheduledThreadPool(10, Thread::new);
    }
}
