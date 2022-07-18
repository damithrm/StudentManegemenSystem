//    CS/2018/035
//    R.M.Damith Rathnayaka


package com.example.studentmanagement.service.implimentation;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        //find all students
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        //save student
        return studentRepository.save(student);
    }

}
