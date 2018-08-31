package com.hillbo.springbootandmybatis.Service;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class RestService extends ResourceConfig {

    public RestService(){
        packages("com.hillbo.springbootandmybatis");
    }

}
