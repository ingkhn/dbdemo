package com.school.service;

import com.school.model.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAll();

  //  Student findAllById(int id);

    void save(Student student);

    void updateStudent(Student student);
}
