package com._8pkgenerationtypes.service;

import com._8pkgenerationtypes.entity.Student;
import com._8pkgenerationtypes.repository.StudentRepository;
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
