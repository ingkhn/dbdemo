package com.school.controller;

import com.school.model.entity.Student;
import com.school.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/students/{student_id}")
    public Student getStudentById(@PathVariable int student_id) {
        return studentService.findAllById(student_id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

}
