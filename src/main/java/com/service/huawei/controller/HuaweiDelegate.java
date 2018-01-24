package com.service.huawei.controller;

import org.springframework.stereotype.Component;


@Component
public class HuaweiDelegate implements Huawei {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
