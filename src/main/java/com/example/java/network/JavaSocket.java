package com.example.java.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class JavaSocket {

    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("127.0.0.1", 80);
        Socket s2 = new Socket("localhost", 80);

        Socket socket = new Socket("127.0.0.1", 80);
        InputStream inputStream = socket.getInputStream();





        socket.close();
    }
}
