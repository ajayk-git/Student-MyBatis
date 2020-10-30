package com.example.StudentRecord.mappers;

import com.example.StudentRecord.entities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from Student")
    List<Student> getAllStudents();

    @Select("select * from Student where studentId=#{id}")
    Student getStudentById(@Param("id") Integer id);

}
