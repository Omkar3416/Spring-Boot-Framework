package com.queryanotation.service;

import com.queryanotation.entity.Gender;
import com.queryanotation.entity.Student;

import java.util.List;


public interface StudentService
{
    public List<Student> fetchAllStudent();

    public List<Student> findPercentageRangeStudent(Double start, Double end);


    public List<Object[]> findGenderNamePerStudent(Double per, Gender gender);
}
