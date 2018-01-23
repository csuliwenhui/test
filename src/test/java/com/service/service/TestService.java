package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testhelloworld(){

        final String NAME = "renhui";
        
        String expactReturnValue = "hello" + NAME; // You should put the expect String type value here.

        String returnValue = serviceDelegate.helloworld(NAME);

        assertEquals(expactReturnValue, returnValue);
    }

}
