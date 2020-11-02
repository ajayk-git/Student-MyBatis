package com.example.StudentRecord.mappers;

import com.example.StudentRecord.entities.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from Student")
    List<Student> getAllStudents();

    @Select("select * from Student where studentId=#{id}")
    Student getStudentById(@Param("id") Integer id);

    @Insert("insert into Student(studentFirstName,studentLastName,fatherName,city,contactnumber,Standard) values(#{studentFirstName},#{studentLastName},#{fatherName},#{city},#{contactNumber},#{standard})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "studentId",resultType = Long.class,before = false)
    void addNewStudent(Student student);


    @Delete("delete from Student where studentId=#{id}")
    void deleteStudentRecord(Integer id);
}
