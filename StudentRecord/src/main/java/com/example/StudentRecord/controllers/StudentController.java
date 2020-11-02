package com.example.StudentRecord.controllers;

import com.example.StudentRecord.entities.Student;
import com.example.StudentRecord.exceptions.ResourceNotFoundException;
import com.example.StudentRecord.mappers.StudentMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentMapper.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable(name = "id") Integer id){
        Student student= studentMapper.getStudentById(id);
        if (student==null){
            throw new ResourceNotFoundException("Student Not Exist.");
        }
        return student;
    }

    @PostMapping("/add")
    public void addNewStudent(@RequestBody Student student){
        studentMapper.addNewStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentRecord(@PathVariable(name = "id") Integer id){
        studentMapper.deleteStudentRecord(id);
    }


}
