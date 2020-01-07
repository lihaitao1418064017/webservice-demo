package com.example.webservice.demo.service.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author LiHaitao
 * @description DemoService:
 * @date 2019/6/17 17:05
 **/
@WebService(name = "DemoService", // 暴露服务名称
        targetNamespace = "http://server.mq.primeton.com"// 命名空间,一般是接口的包名倒序
)
public interface DemoService {

    public String test(String orgCode, String startTime, String endTime, String currentPage, String pageSize, String cardId, String userName, String deptCode);


    /**
     * 获取部门信息
     * @param token
     * @param business
     * @param content
     * @return
     */
    public @WebResult(name = "QueryReturn") String QueryDept(@WebParam(name = "token") String token
            , @WebParam(name = "business") String business,@WebParam(name = "content") String content);

    /**
     * 警员信息
     * @param token
     * @param business
     * @param content
     * @return
     */
    public @WebResult(name = "QueryReturn")
    String QueryData(@WebParam(name = "token") String token
            , @WebParam(name = "business") String business, @WebParam(name = "content") String content);


    /**
     *
     * @param token
     * @param content
     * @return
     */
    @WebMethod
    public @WebResult(name = "uploadSpztReturn")
    String uploadSpzt(@WebParam(name = "token") String token
            , @WebParam(name = "content") String content);

}

