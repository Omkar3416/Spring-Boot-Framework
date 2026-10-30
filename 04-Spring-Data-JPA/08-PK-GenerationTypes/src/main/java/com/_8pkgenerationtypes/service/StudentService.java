package com._8pkgenerationtypes.service;

import com._8pkgenerationtypes.entity.Student;

import java.util.List;

public interface StudentService
{

    public Student addStudent(Student s);

    public List<Student> fetchAll();
}
