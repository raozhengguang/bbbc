package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-27T03:52:24.890Z")

@RestSchema(schemaId = "project65hg")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project65hgImpl {

    @Autowired
    private Project65hgDelegate userProject65hgDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject65hgDelegate.helloworld(name);
    }

}
