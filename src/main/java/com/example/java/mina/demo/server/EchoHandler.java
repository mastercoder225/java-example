package com.example.java.mina.demo.server;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class EchoHandler extends IoHandlerAdapter {

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        System.out.println("EchoHandler: echo service session created");
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        System.out.println("EchoHandler: echo service session opened");
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        System.out.println("EchoHandler: echo service session closed");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        System.out.println("EchoHandler: echo service session idle");
    }

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        cause.printStackTrace();
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        String msg = message.toString();
        if (msg.trim().equalsIgnoreCase("quit")) {
            session.closeNow();
            return;
        }
        session.write("EchoHandler: received message=" + msg + "\n");
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        System.out.println("EchoHandler: sent message=[" + message.toString() + "]");
    }

    @Override
    public void inputClosed(IoSession session) throws Exception {
        super.inputClosed(session);
    }
}
