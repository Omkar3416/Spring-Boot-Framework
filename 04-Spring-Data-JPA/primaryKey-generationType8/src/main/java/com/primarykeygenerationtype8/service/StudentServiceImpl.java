package com.primarykeygenerationtype8.service;

import com.primarykeygenerationtype8.enitty.Student;
import com.primarykeygenerationtype8.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Student> fetchAll() {
        return studentRepository.findAll();
    }


}
