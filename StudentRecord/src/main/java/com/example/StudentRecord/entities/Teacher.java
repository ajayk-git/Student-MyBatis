package com.example.StudentRecord.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher {
    Long teacherId;
    String teacherFirstName;
    String teacherLastName;
    String level;
    String contactNumber;
}
