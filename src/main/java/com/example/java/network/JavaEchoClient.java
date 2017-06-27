package com.example.java.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class JavaEchoClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        while (true) {
            Socket clientSocket = new Socket(InetAddress.getByName("127.0.0.1"), 8080);
            Thread.sleep(1000);
            clientSocket.close();

        }


    }
}
