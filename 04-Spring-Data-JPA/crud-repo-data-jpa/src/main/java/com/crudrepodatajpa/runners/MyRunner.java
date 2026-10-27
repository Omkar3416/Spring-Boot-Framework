package com.crudrepodatajpa.runners;

import com.crudrepodatajpa.entity.Gender;
import com.crudrepodatajpa.entity.Student;
import com.crudrepodatajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Component
public class MyRunner implements ApplicationRunner
{

    @Autowired
    private StudentService studentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Student s = new Student(101,"AAA",60.0, Gender.MALE, LocalDate.now());
        Student t = studentService.saveStudent(s);
        System.out.println("Student data is save Succesfully--->> "+t);
    }
}
