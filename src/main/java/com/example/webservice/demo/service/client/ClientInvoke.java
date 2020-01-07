package com.example.webservice.demo.service.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @author LiHaitao
 * @description ClientInvoke:
 * @date 2020/1/7 10:10
 **/
public class ClientInvoke {

    public static void main(String[] args) throws Exception {
        JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();

        Client client=dcflient.createClient("http://localhost:8081/test/api?wsdl");

        Object[] objects=client.invoke("test","411001","test","411001","test","411001","test","411001");
        System.out.println("*******"+objects[0].toString());
    }
}
