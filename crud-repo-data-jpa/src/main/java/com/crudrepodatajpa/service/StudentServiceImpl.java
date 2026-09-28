package com.crudrepodatajpa.service;

import com.crudrepodatajpa.entity.Student;
import com.crudrepodatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        Student s = studentRepository.save(student);
        return s;
    }
}
