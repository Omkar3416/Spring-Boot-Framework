package com.queryanotation.service;

import com.queryanotation.entity.Gender;
import com.queryanotation.entity.Student;
import com.queryanotation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("StudentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> fetchAllStudent() {

        return studentRepository.findAllUsingJPQL();

        //return studentRepository.findAllUsingSQL();
    }

    @Override
    public List<Student> findPercentageRangeStudent(Double start, Double end) {
//        return studentRepository.findPercentageRangeUsingJPQL(start, end);

        return studentRepository.findPercentageRangeUsingSQL(start, end);

    }

    @Override
    public List<Object[]> findGenderNamePerStudent(Double per, Gender gender) {
        return studentRepository.findGenderNamePer(per,gender);
    }

}
