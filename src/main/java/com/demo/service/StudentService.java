package com.demo.service;


import com.demo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll(Student student);

    void deleteStudent(int id);

    int addStudent(Student student);

    Student getStudentById(int id);

    boolean updateStudent(Student student);
}
