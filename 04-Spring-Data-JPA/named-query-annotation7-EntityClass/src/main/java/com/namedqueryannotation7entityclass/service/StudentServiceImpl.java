package com.namedqueryannotation7entityclass.service;

import com.namedqueryannotation7entityclass.entity.Gender;
import com.namedqueryannotation7entityclass.entity.Student;
import com.namedqueryannotation7entityclass.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> fetchAllGreaterThanPerAndGender(Double per, Gender gender)
    {
        return studentRepository.findAllGreaterThanPerAndGender(per,gender);
    }

    @Override
    public void modifyStudent(String name, Integer rno) {

        studentRepository.updateName(name, rno);

    }

    @Override
    public List<Object[]> fetchGenderAndName() {
      return studentRepository.findGenderAndName();
    }

    @Override
    public List<Object[]> countByGender() {
        return studentRepository.countByGender();
    }


}

