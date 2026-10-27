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
import java.util.List;
import java.util.Optional;

@Component
public class MyRunner implements ApplicationRunner
{

    @Autowired
    private StudentService studentService;

    public static void printStudents(List<Student> students)
    {
        for(Student s : students)
        {
            System.out.println("Roll Number : " + s.getRno());
            System.out.println("name : " + s.getName());
            System.out.println("percentage : " + s.getPer());
            System.out.println("Gender : " + s.getGender());
            System.out.println("Birth date : " + s.getBirthDate());

            System.out.println("----".repeat(50));
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Student s = new Student(101,"AAA",60.0, Gender.MALE, LocalDate.now());
//        Student t = studentService.saveStudent(s);
//        System.out.println("Student data is save Succesfully--->> "+t);


//       TEST CASE FOR UPDATE STUDENT
//        Student s = new Student(101,"AAA",60.0, Gender.MALE, LocalDate.of(2026,9,28));
//        s.setPer(75.20);
//        s.setName("omkar");
//
//
//
//        Student updated = studentService.updateStudent(s);
//
//        System.out.print("UPDATED STUDENT : " +updated);

        //TEST CASE FOR SAVE OR UPDATE STUDENT
//        Student s = new Student(102,"BBB",83.9, Gender.FEMALE, LocalDate.of(2026,9,28));
//        Student t = studentService.saveOrUpdateStudent(s);
//        System.out.println("Student data is save Succesfully--->> "+t);

        //TEST CASE FOR FINDBYID

//        Integer id = 101;
//
//        Optional<Student> ob = studentService.fetchById(id);
//
//
//
//        if(ob.isPresent()){
//            Student s = ob.get();
//            System.out.println("Roll Number : " + s.getRno());
//            System.out.println("name : " + s.getName());
//            System.out.println("percentage : " + s.getPer());
//            System.out.println("Gender : " + s.getGender());
//            System.out.println("Birth date : " + s.getBirthDate());
//
//        }
//        else{
//            System.out.println("NO data Found : ---");
//        }

        //TEST CASE FOR FETCHALLSTUDENTS

        List<Student> students = studentService.fetchAllStudents();

        if(students.isEmpty())
        {
            System.out.println("No student is present");
        }
        else
        {
            MyRunner.printStudents(students);
        }

    }
}
