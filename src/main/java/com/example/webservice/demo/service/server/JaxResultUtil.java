package com.example.webservice.demo.service.server;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
* @Description:
* @Author:         Lihaitao
* @Date:       2020/1/7 17:22
* @UpdateUser:
* @UpdateRemark:
*/
@Slf4j
public class JaxResultUtil {

    private static JAXBContext context = null;

    private static Marshaller marshaller = null;

    static {
        try {
            context = JAXBContext.newInstance(User.class);
            marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        } catch (JAXBException e) {
            log.error("JaxResultUtil init exception", e);
        }
    }

    public static <T> String objToXmlString(T obj) throws JAXBException {
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);
        return writer.toString();
    }


}