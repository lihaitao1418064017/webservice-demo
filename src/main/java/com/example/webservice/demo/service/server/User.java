package com.example.webservice.demo.service.server;


import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author LiHaitao
 * @description User:
 * @date 2020/1/6 17:51
 **/
@Builder
@XmlRootElement(name = "user")
//@XmlType(propOrder = { "name", "age" }) // 定义xml节点的顺序
public class User {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "age")
    private String age;


}
