package com.school.service.impl;

import com.school.model.entity.Student;
import com.school.repository.StudentRepository;
import com.school.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findAllById(int id) {
        Optional<Student> result = studentRepository.findAllById(id);

        Student student = null;
        if(result.isPresent())
            student = result.get();
        else
            throw new RuntimeException("Did not find student id: " + id);

        return student;
    }

    @Override
    public void save(Student student) {
        studentRepository.saveAndFlush(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.saveAndFlush(student);
    }
}
