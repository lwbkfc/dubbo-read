package com.lwb.xmlrpc.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

/**
 * Created by lwb on 2016/9/1.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://localhost:8080/helloHandler"));
            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);
            Vector<String> params = new Vector<String>();
            params.addElement("linwenbo");
            String result = (String) client.execute("HelloHandlerImpl.execute",params);
            System.out.println(result);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }
    }
}









































