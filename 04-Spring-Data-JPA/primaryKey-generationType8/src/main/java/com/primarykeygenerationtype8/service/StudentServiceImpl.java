package com.primarykeygenerationtype8.service;

import com.primarykeygenerationtype8.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;
}
