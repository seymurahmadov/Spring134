package com.example.spring134.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello(String name){
        return name;
    }
}
