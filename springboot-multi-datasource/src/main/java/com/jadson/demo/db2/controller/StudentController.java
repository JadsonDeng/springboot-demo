package com.jadson.demo.db2.controller;

import com.jadson.demo.db2.mapper.StudentMapper;
import com.jadson.demo.db2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "/list")
    public List<Student> list() {
        List<Student> students = studentMapper.selectList();
        System.out.println("students:" + students);
        return students;
    }

}
