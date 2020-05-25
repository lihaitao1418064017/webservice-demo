package com.example.webservice.demo;

import cn.hutool.core.thread.ThreadUtil;
import com.example.webservice.demo.service.server.User;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    ExecutorService executorService;

    @Before
    public void before() {
        executorService = ThreadUtil.newExecutor(10);
    }



    @Test
    public void contextLoads() throws Exception {

        //		http://cxf.jq.ctsp.kedacom.com/

        for (int i = 0; i < 10000; i++) {
            executorService.submit(() -> {
                JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();
                Object[] objects1 = new Object[1];
                try {
                    Client client = dcflient.createClient("http://localhost:8080/cvf/services/policeCaseWS?wsdl");
                    objects1 = client.invoke("GetFile", "32020000001320000990012019081609584200028");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.err.println(objects1[0].toString());
            });
            Thread.sleep(100);
        }


    }

    @Test
    public void test() throws Exception {

        JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();

        for (int i = 0; i < 100; i++) {

            Client client = dcflient.createClient("http://10.68.7.21/cvf/services/policeCaseWS?wsdl");
            //		Client client=dcflient.createClient("http://localhost:8080/cvf/policeCaseWS?wsdl");

            //		Object[] objects=client.invoke("GetFile","32020000001320000990012019081609584200028");
            System.out.println("****************************************************************************");
            Object[] objects1 = client.invoke("GetFile", "1001");

            System.err.println(objects1[0].toString());
            System.err.println("i==> " + i);
        }


        //        JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();
        //        Client client = dcflient.createClient("http://localhost:8081/test/api?wsdl");
        //        Object[] objects1 = client.invoke("test", "");
        //        System.err.println(objects1[0].toString());
    }

    @Test
    public void testXml() throws Exception {
        JaxWsDynamicClientFactory dcflient = JaxWsDynamicClientFactory.newInstance();
        Client client = dcflient.createClient("http://localhost:8081/test/api?wsdl");
        Object[] objects1 = client.invoke("testXml", "");
        System.err.println(objects1[0].toString());
    }

}
