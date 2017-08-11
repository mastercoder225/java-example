package com.example.java.jvm;

public class JvmRuntimeDataAreas {

    public static void main(String[] args) {
        // 1. The pc(program counter) register - returnAddress or a native pointer (per-thread)
        // 2. JVM stack - stores frames and throws StackOverflowError|OutOfMemoryError (per-thread)
        // 3. Heap - throws OutOfMemoryError (shared)
        // 4. Method Area - throws OutOfMemoryError (shared)
        // 5. Run-Time Constant Pool - throws OutOfMemoryError (per-class or per-interface)
        // 6. Native stack - throws StackOverflowError|OutOfMemoryError (per-thread)
    }
}
