package com.example.StudentRecord.mappers;

import com.example.StudentRecord.entities.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {

    @Select("select * from Teacher ")
    List<Teacher> getAllTeachers();

    @Select("select * from Teacher where teacherId=#{id}")
    Teacher getTeacherById(@Param("id") Integer id);

    @Insert("insert into Teacher(teacherFirstName,teacherLastName,level,contactnumber) values(#{teacherFirstName},#{teacherLastName},#{level},#{contactNumber})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "teacherId",resultType = Long.class,before = false)
    void addNewTeacher(Teacher teacher);

    @Delete("delete from Teacher where teacherId=#{id}")
    void deleteTeacherRecord(Integer id);
}
//    String teacherFirstName;
//    String teacherLastName;
//    String level;
//    String contactNumber;
