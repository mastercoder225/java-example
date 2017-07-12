package com.example.java.mina.core;

import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.IoServiceListener;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaIoService {

    public static void main(String[] args) {
        IoService ioService = new NioSocketAcceptor();

        TransportMetadata transportMetadata = ioService.getTransportMetadata();

        // ioService.addListener();

















    }
}
