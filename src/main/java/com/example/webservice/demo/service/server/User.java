package com.example.webservice.demo.service.server;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author LiHaitao
 * @description User:
 * @date 2020/1/6 17:51
 **/

@XmlRootElement(name = "user")
@XmlType(propOrder = { "name", "age" }) // 定义xml节点的顺序,属性必须在这
public class User {

    public User(){

    }
    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private String age;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name = "age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }




}
