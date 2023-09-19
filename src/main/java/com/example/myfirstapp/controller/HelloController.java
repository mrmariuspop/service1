package com.example.myfirstapp.controller;

import com.example.myfirstapp.client.Service2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Service2Client service2Client;

    @GetMapping("/first")
    public String sayHello() {
        return "Acesta este primul meu API";
    }

    @GetMapping("/second")
    public String sayHelloWorld() {
        return "Acesta este al doilea API";
    }

    @GetMapping("/feign")
    public String callSecondService() {
        String stringFromService2 = service2Client.getStringFromService2();
        return stringFromService2;
    }

}
