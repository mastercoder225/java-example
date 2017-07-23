package com.example.java.nio;

import java.nio.Buffer;
import java.nio.CharBuffer;

public class JavaBuffer {

    public static void main(String[] args) {
        Buffer buffer = CharBuffer.allocate(10);

        // query operations
        // 0 <= mark <= position <= limit <= capacity
        int position = buffer.position();
        int limit = buffer.limit();
        int capacity = buffer.capacity();
        boolean hasRemaining = buffer.hasRemaining();
        int remaining = buffer.remaining();
        boolean hasArray = buffer.hasArray();
        int arrayOffset = buffer.arrayOffset();
        Object array = buffer.array();
        boolean isDirect = buffer.isDirect();
        boolean isReadOnly = buffer.isReadOnly();

        // modification operations
        Buffer buffer1 = buffer.clear();
        Buffer buffer2 = buffer.flip();
        Buffer buffer3 = buffer.rewind();
        Buffer buffer4 = buffer.mark();
        Buffer buffer5 = buffer.reset();
        Buffer buffer6 = buffer.position(5);
        Buffer buffer7 = buffer.limit(5);
    }
}
