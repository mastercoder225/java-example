package com.example.java.nio;

import java.io.IOException;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

public class JavaChannel {

    public static void main(String[] args) throws IOException {
        Channel channel = FileChannel.open(Paths.get("test.txt"), READ, WRITE, TRUNCATE_EXISTING);

        boolean isOpen = channel.isOpen();
        channel.close();
    }
}
