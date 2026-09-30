package com.crudrepodatajpa.service;

import com.crudrepodatajpa.entity.Student;
import com.crudrepodatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("StudentService")
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
//        Student s = studentRepository.save(student);
//        return s;

        return studentRepository.save(student);
    }
;
    @Override
    public Student updateStudent(Student student) {
        Student s = studentRepository.save(student);
        return s;
    }

    @Override
    public Student saveOrUpdateStudent(Student student)
    {
        Student s = studentRepository.save(student);
        return s;
    }

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

}
