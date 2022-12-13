package com.example.spring134.controller;

import com.example.spring134.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private HelloService helloService;

    @GetMapping("/api/get/{name}")
    public String getStudent(@PathVariable String name){
      return   helloService.hello(name);
    }

}
