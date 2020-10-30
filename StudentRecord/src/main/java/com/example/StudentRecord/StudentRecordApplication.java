package com.example.StudentRecord;

import com.example.StudentRecord.entities.Student;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MappedTypes(Student.class)
@MapperScan("com/example/StudentRecord/mappers")
public class StudentRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordApplication.class, args);
	}

}
