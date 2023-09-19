package com.example.myfirstapp.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "second-service", url = "http://localhost:8082")
public interface Service3Client {

    @RequestMapping(method = RequestMethod.GET, value = "/micro2/print")
    public String getStringFromService2();
}
