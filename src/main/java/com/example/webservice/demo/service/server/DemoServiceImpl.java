package com.example.webservice.demo.service.server;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import javax.jws.WebService;

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

    @Override
    public String test(String orgCode, String startTime, String endTime, String currentPage, String pageSize, String cardId, String userName, String deptCode) {
        String result = "orgCode: " + orgCode +
                ",startTime: " + startTime +
                ",endTime: " + endTime +
                ",currentPage: " + currentPage +
                ",pageSize: " + pageSize +
                ",cardId: " + cardId +
                ",userName: " + userName +
                ",deptCode: " + deptCode;

        User lihaitao = User.builder().age("18").name("lihaitao").build();


        return JSONUtil.toJsonStr(lihaitao);
    }

    @Override
    public String QueryDept(String token, String business, String content) {
        String data = "{\n" +
                "\n" +
                "\"status\":\"0000\",\n" +
                "\n" +
                "\"data\":[\n" +
                "\n" +
                "{\"glbm\":\"140119000100\",\"bmmc\":\"万柏林二大队综合中队\",\"bmqc\":\"山西省太原市公安局交通警察支队万柏林二大队综合中队\",\"sjbm\":\"\"},\n" +
                "{\"glbm\":\"140119000101\",\"bmmc\":\"第三中队\",\"bmqc\":\"山西省太原市公安局交通警察支队第三中队\",\"sjbm\":\"140110010300\"},\n" +

                "\n" +
                "{\"glbm\":\"140110010300\",\"bmmc\":\"晋源一大队事故中队\",\"bmqc\":\"山西省太原市公安局交通警察支队晋源一大队事故中队\",\"sjbm\":\"140119000100\"}\n" +
                "\n" +
                "],\n" +
                "\n" +
                "\"error\":null\n" +
                "\n" +
                "}";
        System.err.println(content);
        System.err.println(business);
        System.err.println(token);
        return JSONUtil.parseObj(data).toString();
    }

    @Override
    public String QueryData(String token, String business, String content) {
        String result = "{\n" +
                "\n" +
                "  \"status\":\"0000\",\n" +
                "\n" +
                "  \"data\":[\n" +
                "\n" +
                "    {\"jh\":\"017575\",\"xm\":\"张一平\",\"bmdm\":\"140110010300\"},\n" +
                "\n" +
                "     { \"jh\":\"017345\",\"xm\":\"李三\",\"bmdm\":\"140110010300\"}\n" +
                "\n" +
                "  ],\n" +
                "\n" +
                "  \"error\":null\n" +
                "\n" +
                "}";
        JSONObject jsonObject = JSONUtil.parseObj(result);
        System.err.println(content);
        System.err.println(business);
        System.err.println(token);
        return jsonObject.toString();
    }

    @Override
    public String uploadSpzt(String token, String content) {
        String result = "{" +
                "" +
                "\"status\":\"0000\"," +
                "" +
                "\"data\":null," +
                "" +
                "\"error\":null" +
                "" +
                "}";
        JSONObject jsonObject = JSONUtil.parseObj(result);
        System.err.println(content);
        System.err.println(token);
        return jsonObject.toString();
    }

}

