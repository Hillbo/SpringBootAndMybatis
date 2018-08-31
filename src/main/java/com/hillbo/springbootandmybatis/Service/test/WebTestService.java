package com.hillbo.springbootandmybatis.Service.test;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/webTestService")
@Component
public class WebTestService {

    @GET
    @Path("/sayHello")
    public String SayHello(){
        return "helloWorld!";
    }
}
