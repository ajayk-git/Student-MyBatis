package com.example.StudentRecord.mappers;

import com.example.StudentRecord.entities.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

    @Select("select * from Teacher ")
    List<Teacher> getAllTeachers();

    @Select("select * from Teacher where teacherId=#{id}")
    Teacher getTeacherById(@Param("id") Integer id);
}
