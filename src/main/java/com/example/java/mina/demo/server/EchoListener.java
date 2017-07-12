package com.example.java.mina.demo.server;

import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.IoServiceListener;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class EchoListener implements IoServiceListener {

    @Override
    public void serviceActivated(IoService service) throws Exception {
        System.out.println("EchoListener: echo service activated");
    }

    @Override
    public void serviceIdle(IoService service, IdleStatus idleStatus) throws Exception {
        System.out.println("EchoListener: echo service idle");
    }

    @Override
    public void serviceDeactivated(IoService service) throws Exception {
        System.out.println("EchoListener: echo service deactivated");
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        System.out.println("EchoListener: echo service session created");
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        System.out.println("EchoListener: echo service session closed");
    }

    @Override
    public void sessionDestroyed(IoSession session) throws Exception {
        System.out.println("EchoListener: echo service session destroyed");
    }
}
