package com.example.StudentRecord.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    Long studentId;
    String studentFirstName;
    String studentLastName;
    String fatherName;
    String city;
    String contactNumber;
    Integer standard;
}
