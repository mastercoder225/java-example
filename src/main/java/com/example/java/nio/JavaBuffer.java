package com.example.java.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class JavaBuffer {

    public static void main(String[] args) {
        Buffer buffer = ByteBuffer.allocate(100);

        int capacity = buffer.capacity();
        int limit = buffer.limit();
        int position = buffer.position();

        buffer.mark();
        buffer.reset();

        buffer.clear();
    }
}
