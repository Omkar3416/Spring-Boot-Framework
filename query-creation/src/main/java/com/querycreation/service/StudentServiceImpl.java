package com.querycreation.service;

import com.querycreation.entity.Gender;
import com.querycreation.entity.Student;
import com.querycreation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Optional<Student> fetchById(Integer rno) {
//      Optional<Student>  s = studentRepository.findById(rno);
//       return s;

        return studentRepository.findById(rno);
    }
    @Override
    public List<Student> fetchAllStudents() {
        return (List<Student>)studentRepository.findAll();
    }

    @Override
    public List<Student> fetchByGender(Gender gender) {
        return studentRepository.findByGender(gender);
    }

    @Override
    public List<Student> fetchByBirthDate(LocalDate d) {
        return studentRepository.findByBirthDate(d);
    }

    @Override
    public List<Student> fetchByBirthDateGreaterThan(LocalDate d) {
        return studentRepository.findByBirthDateGreaterThan(d);
    }
}
