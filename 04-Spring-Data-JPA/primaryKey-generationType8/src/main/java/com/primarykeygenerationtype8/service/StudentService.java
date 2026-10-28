package com.primarykeygenerationtype8.service;

import com.primarykeygenerationtype8.enitty.Student;

import java.util.List;

public interface StudentService
{

    public Student addStudent(Student s);

    public List<Student> fetchAll();
}
