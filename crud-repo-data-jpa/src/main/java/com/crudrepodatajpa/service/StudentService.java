package com.crudrepodatajpa.service;

import com.crudrepodatajpa.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService
{
    public Student saveStudent(Student student);
    public Student updateStudent(Student student);

    public Student saveOrUpdateStudent(Student student);

    public Optional<Student> fetchById(Integer rno);

    public List<Student> fetchAllStudents();


}
