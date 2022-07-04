package com.demo.service.impl;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll(Student student) {
        List<Student> studentList = studentMapper.findAll(student);
        System.out.println(studentList);
        return studentList;
    }

    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public int addStudent(Student student) {
        int i = studentMapper.addStudent(student);
        return i;
    }

    @Override
    public Student getStudentById(int id) {
        Student student = studentMapper.getStudentById(id);
        return student;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean flag = studentMapper.updateStudent(student);
        return flag;
    }
}
