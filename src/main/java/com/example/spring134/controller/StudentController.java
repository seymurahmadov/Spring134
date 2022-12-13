package com.example.spring134.controller;

import com.example.spring134.dto.StudentDTO;
import com.example.spring134.entity.StudentEntity;
import com.example.spring134.request.UpdateRequest;
import com.example.spring134.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public StudentEntity addStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }

    @GetMapping("/get-all")
    public List<StudentEntity> getAll() {
        return studentService.getAllStudent();
    }

    @DeleteMapping("/delete")
    public void deleteById(@RequestBody StudentDTO dto) throws Exception {
        studentService.deleteStudent2(dto);
    }

    @PutMapping("/update")
    public StudentEntity updateStudent(@RequestBody UpdateRequest updateRequest) throws Exception {
        return studentService.updateStudent(updateRequest);
    }
}
