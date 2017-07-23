package com.example.java.nio.channels;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class JavaServerSocketChannel {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("localhost", 8080));

        while (true) {
            SocketChannel socketChannel = serverSocketChannel.accept();

            // do something with socketChannel
        }

    }
}
