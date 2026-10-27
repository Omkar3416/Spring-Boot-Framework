package com.namedqueryannotation6.service;

import com.namedqueryannotation6.entity.Gender;
import com.namedqueryannotation6.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void removeByPerAndGender(Double per, Gender gender) {
        studentRepository.deleteByPerAndGender(per,gender);
    }
}
