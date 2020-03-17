package com.school.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int student_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(name = "course_id")
    private Course course_id;

    public Student(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}

