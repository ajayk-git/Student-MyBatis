package com.example.StudentRecord.controllers;

import com.example.StudentRecord.entities.Teacher;
import com.example.StudentRecord.mappers.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherMapper teacherMapper;

    @GetMapping("/all")
    List<Teacher> getAllTeachers(){
        return teacherMapper.getAllTeachers();
    }

    @GetMapping("/{id}")
    Teacher getTeacherById(@PathVariable(name = "id") Integer id){

      Teacher teacher=teacherMapper.getTeacherById(id);
      if (teacher==null)
          System.out.println("Not Exist");
      return teacher;
    }
}
