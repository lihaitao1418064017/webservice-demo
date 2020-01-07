package com.example.webservice.demo.service.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;

/**
 * @author LiHaitao
 * @description DemoService:
 * @date 2019/6/17 17:05
 **/
@WebService(name = "DemoService", // 暴露服务名称
        targetNamespace = "http://server.mq.primeton.com"// 命名空间,一般是接口的包名倒序
)
public interface DemoService {

    @WebMethod(operationName = "test")//方法名test
    public @WebResult(name = "QueryReturn") String test(@WebParam(name = "test")String code);


    @WebMethod(operationName = "testXml")//方法名test
    public @WebResult(name = "QueryReturn") String testXml(@WebParam(name = "test")String code) throws JAXBException;



}

