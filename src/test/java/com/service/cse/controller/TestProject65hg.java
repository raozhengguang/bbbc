package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject65hg {

        Project65hgDelegate project65hgDelegate = new Project65hgDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project65hgDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}