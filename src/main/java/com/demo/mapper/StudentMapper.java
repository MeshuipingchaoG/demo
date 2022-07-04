package com.demo.mapper;


import com.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> findAll(Student student);

    void deleteStudent(int id);

    int addStudent(Student student);

    Student getStudentById(int id);

    boolean updateStudent(Student student);
}
