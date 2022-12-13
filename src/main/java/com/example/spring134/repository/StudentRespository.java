package com.example.spring134.repository;

import com.example.spring134.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentRespository extends CrudRepository<StudentEntity, Long> {
//    List<StudentEntity> findAll();
}
