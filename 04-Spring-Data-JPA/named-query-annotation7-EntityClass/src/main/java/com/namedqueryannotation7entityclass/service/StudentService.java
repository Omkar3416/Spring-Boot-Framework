package com.namedqueryannotation7entityclass.service;

import com.namedqueryannotation7entityclass.entity.Gender;
import com.namedqueryannotation7entityclass.entity.Student;

import java.util.List;

public interface StudentService
{
    public List<Student> fetchAllGreaterThanPerAndGender(Double per, Gender gender);

    public void modifyStudent(String name, Integer rno);

    public List<Object[]> fetchGenderAndName();

    public List<Object[]> countByGender();


}
