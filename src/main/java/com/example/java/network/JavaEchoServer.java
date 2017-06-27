package com.example.java.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaEchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 8080));

        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true) {
            Socket clientSocket = serverSocket.accept();
            executorService.submit(() -> System.out.println(new Random().nextInt(100)));
            clientSocket.close();
        }
    }
}
