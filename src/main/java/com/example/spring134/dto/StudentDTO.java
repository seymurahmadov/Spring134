package com.example.spring134.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class StudentDTO {
   Long id;

   @NotNull(message = "Must be not Null and Blank")
   @Size(min = 3)
   String name;

   @NotNull(message = "Must be not Null and Blank")
   @Size(min = 3)
   String surname;

   @Min(value = 17)
   Integer age;



}
