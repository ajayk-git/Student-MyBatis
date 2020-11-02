package com.example.StudentRecord.controllers;

import com.example.StudentRecord.entities.Teacher;
import com.example.StudentRecord.exceptions.ResourceNotFoundException;
import com.example.StudentRecord.mappers.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
          throw new ResourceNotFoundException("Teacher Not Exist.");
      else
        return teacher;
    }

    @PostMapping("/add")
    public  void addNewTeacher(@RequestBody Teacher teacher){
        teacherMapper.addNewTeacher(teacher);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteTeacherRecord(@PathVariable(name = "id") Integer id){
        teacherMapper.deleteTeacherRecord(id);
    }
}
