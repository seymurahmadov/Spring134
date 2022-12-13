package com.example.spring134.request;

import lombok.Data;

@Data
public class UpdateRequest {
    int id;
    String name;
    String surname;
    int age;
}
