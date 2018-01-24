package com.service.huawei.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-24T08:24:11.096Z")

@RpcSchema(schemaId = "huawei")
public class HuaweiImpl implements Huawei{

    @Autowired
    private HuaweiDelegate huaweiDelegate;


    public String helloworld(String name) {

        return huaweiDelegate.helloworld(name);
    }

}
