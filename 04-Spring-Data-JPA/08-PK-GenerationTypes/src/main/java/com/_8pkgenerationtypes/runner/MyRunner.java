package com._8pkgenerationtypes.runner;

import com._8pkgenerationtypes.entity.Gender;
import com._8pkgenerationtypes.entity.Student;
import com._8pkgenerationtypes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

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

        //        Student s = new Student("AAA",60.0, Gender.MALE, LocalDate.now()); // ERROR NO-Arg Constructor from Entity class

        Student s = new Student(); // null, "AAA",60.0, Gender.MALE, LocalDate.now()


        s.setName("AAA");
        s.setRno(300);
        s.setPer(60.0);
        s.setBirthDate(LocalDate.now());
        s.setGender(Gender.MALE);

        Student returnStudent = studentService.addStudent(s); // 101, "AAA",60.0, Gender.MALE, LocalDate.now()
        System.out.println("Record Is Saved With ID : " + returnStudent.getRno());

        List<Student> students = studentService.fetchAll();
        System.out.println(students);

    }
}
