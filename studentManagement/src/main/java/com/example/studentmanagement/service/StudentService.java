//    CS/2018/035
//    R.M.Damith Rathnayaka

package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
