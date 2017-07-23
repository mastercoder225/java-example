package com.example.java.nio.channels;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.WRITE;

public class JavaFileChannel {

    public static void main(String[] args) throws Exception {
        FileChannel fileChannel = FileChannel.open(Paths.get("test.txt"));


        ByteBuffer byteBuffer = ByteBuffer.allocate(100);

        while (byteBuffer.hasRemaining()) {
            System.out.println(fileChannel.write(byteBuffer));
        }

        fileChannel.force(true);





        System.out.println(fileChannel.size());



        boolean isOpen = fileChannel.isOpen();

        System.out.println(isOpen);















        fileChannel.close();

    }
}
