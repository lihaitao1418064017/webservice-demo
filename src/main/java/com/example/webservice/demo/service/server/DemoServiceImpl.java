package com.example.webservice.demo.service.server;

import cn.hutool.json.JSONUtil;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;

/**
 * @author LiHaitao
 * @description DemoServiceImpl:
 * @date 2019/6/17 17:06
 **/

@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://server.mq.primeton.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.example.webservice.demo.service.server.DemoService"// 接口地址
)
public class DemoServiceImpl implements DemoService {
    /**
     * 返回json
     * @param orgCode
     * @return
     */
    @Override
    public String test(String orgCode) {
        User lihaitao =new User("lihaitao","18");
        return JSONUtil.toJsonStr(lihaitao);
    }


    /**
     * 返回xml
     * @param orgCode
     * @return
     */
    @Override
    public String testXml(String orgCode) throws JAXBException {
        User lihaitao =new User("lihaitao","18");
        return JaxResultUtil.objToXmlString(lihaitao);
    }

}

