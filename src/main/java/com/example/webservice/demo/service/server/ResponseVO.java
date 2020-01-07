package com.example.webservice.demo.service.server;

import lombok.Data;

/**
 * @author LiHaitao
 * @description ResponseVO:
 * @date 2019/6/21 10:18
 **/
@Data
public class ResponseVO {
    private String status;
    private String data;
    private String error;
}
