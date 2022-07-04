package com.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.entity.Student;
import com.demo.entity.vo.StudentQry;
import com.demo.service.StudentService;
import com.demo.utils.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 查询所有学生
    @GetMapping("/getAll")
    public ResultResponse findAllStudent(Student student) {
        List<Student> list = studentService.findAll(student);
        return ResultResponse.ok().data("list", list);
    }

    // 删除学生
    @DeleteMapping("/deleteStudent/{id}")
    public ResultResponse deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return ResultResponse.ok();
    }

    // 添加学生
    @PostMapping("/addStudent")
    public ResultResponse saveStudent(Student student) {
        int i = studentService.addStudent(student);
        if (i > 0){
            return ResultResponse.ok();
        } else {
            return ResultResponse.error();
        }
    }

    // 通过学生id查找学生信息
    @GetMapping("/queryStudentInfoById/{id}")
    public ResultResponse queryStudentInfoById(@PathVariable Integer id) {
        Student student = studentService.getStudentById(id);
        return ResultResponse.ok().data("studentInfo", student);
    }

    // 修改学生信息
    @PostMapping("/updateStudent")
    public ResultResponse updateStudent(Student student) {
        boolean flag = studentService.updateStudent(student);
        if (flag) {
            return ResultResponse.ok();
        }else {
            return ResultResponse.error();
        }
    }

    // 条件查询
    @GetMapping("/getStudentCondition")
    public ResultResponse getStudentCondition(StudentQry studentQry) {

        /**
         * 条件查询
         */
        return ResultResponse.ok();
    }
}
