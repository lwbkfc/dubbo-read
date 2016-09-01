package com.lwb.xmlrpc.server.impl;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.XmlRpcServletServer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lwb on 2016/9/1.
 */
public class XmlRpcServicesServlet extends HttpServlet {
    private XmlRpcServletServer server;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            System.out.println("hello world");
            server = new XmlRpcServletServer();
            PropertyHandlerMapping pmp = new PropertyHandlerMapping();
            pmp.addHandler("HelloHandlerImpl",HelloHandlerImpl.class);
            server.setHandlerMapping(pmp);

            XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl) server.getConfig();
            serverConfig.setEnabledForExceptions(true);
            serverConfig.setContentLengthOptional(false);
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        server.execute(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        server.execute(req,resp);
    }
}



































