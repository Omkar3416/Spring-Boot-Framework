package com.querycreation.service;

import com.querycreation.entity.Gender;
import com.querycreation.entity.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface StudentService {


    public Optional<Student> fetchById(Integer rno);

    public List<Student> fetchAllStudents();

    public List<Student> fetchByGender(Gender gender);

    public List<Student> fetchByBirthDate(LocalDate d);

    public List<Student> fetchByBirthDateGreaterThan(LocalDate d);

}
