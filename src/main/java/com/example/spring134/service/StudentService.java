package com.example.spring134.service;

import com.example.spring134.dto.StudentDTO;
import com.example.spring134.entity.StudentEntity;
import com.example.spring134.repository.StudentRespository;
import com.example.spring134.request.UpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRespository respository;

    public StudentEntity addStudent(StudentDTO dto) {


        StudentEntity studentEntity = StudentEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .surname(dto.getSurname())
                .age(dto.getAge())
                .build()    ;

        return respository.save(studentEntity);
    }

    public List<StudentEntity> getAllStudent() {

        Iterable<StudentEntity> all = respository.findAll();

        List<StudentEntity> list = new ArrayList<>();

        all.forEach(list::add);
        return list;
    }

//    public void deleteStudent(DeleteRequest deleteRequest) {
//        StudentEntity studentEntity = respository.findById((long) deleteRequest.getId()).get();
//        respository.delete(studentEntity);
//    }

    public StudentEntity updateStudent(UpdateRequest updateRequest) throws Exception {
        StudentEntity student = respository.findById((long) updateRequest.getId()).orElseThrow(Exception::new);
        student.setAge(updateRequest.getAge());
        student.setName(updateRequest.getName());
        student.setSurname(updateRequest.getSurname());
    return respository.save(student);
    }

    public void deleteStudent2 (StudentDTO dto) throws Exception {
        StudentEntity studentEntity = respository.findById(dto.getId()).orElseThrow(Exception::new);
       respository.delete(studentEntity);
    }
}
