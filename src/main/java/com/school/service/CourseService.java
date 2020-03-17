package com.school.service;

import com.school.model.entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseService {
    List<Course> findAll();
}
