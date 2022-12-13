package com.example.spring134.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEntity {

    @Id
    Long id;

    @NotNull(message = "Must not be Null and Blank")
    @Size(min = 3)
    String name;

    @NotBlank(message = "Must be not Null and Blank")
    @Size(min = 3)
    String surname;

    @Positive
    @Min(value = 17, message = "Cannot be younger than 17")
    int age;


}
