package com.mycompany.sg.server.servlet;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mycompany.sg.client.service.HelloServiceRPC;
import org.apache.log4j.Logger;

public class HelloServiceRPCServlet extends RemoteServiceServlet implements HelloServiceRPC {

    private static final Logger log = Logger.getLogger(HelloServiceRPCServlet.class);

    @Override
    public String say(String name) {
        return "Hello " + name;
    }
}
