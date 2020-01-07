package com.example.webservice.demo;

import com.example.webservice.demo.service.server.User;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() throws Exception {
		JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();

		Client client=dcflient.createClient("http://localhost:8080/cvf/services/policeCaseWS?wsdl");

//		Object[] objects=client.invoke("GetFile","32020000001320000990012019081609584200028");
		System.out.println("****************************************************************************");
		Object[] objects1=client.invoke("GetFiles","2022-08-10 09:58:48","2022-08-10 10:01:49","","","");

		System.err.println(objects1[0].toString());
	}

	@Test
	public void test() throws Exception {
		JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();
		Client client=dcflient.createClient("http://localhost:8081/test/api?wsdl");
		Object[] objects1=client.invoke("test","");
		System.err.println(objects1[0].toString());
	}

	@Test
	public void testXml() throws Exception {
		JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();
		Client client=dcflient.createClient("http://localhost:8081/test/api?wsdl");
		Object[] objects1=client.invoke("testXml","");
		System.err.println(objects1[0].toString());
	}

}
