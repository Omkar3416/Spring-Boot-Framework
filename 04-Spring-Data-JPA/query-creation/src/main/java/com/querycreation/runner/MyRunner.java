package com.querycreation.runner;

import com.querycreation.entity.Gender;
import com.querycreation.entity.Student;
import com.querycreation.service.StudentService;
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

/*
        // find by gender
        List<Student> students = studentService.fetchByGender(Gender.MALE);

        if (students.isEmpty())
        {
            System.out.println("No students found for given Gender ");

        }
        else
        {
            System.out.println("Gender wise List of students");
            MyRunner.printStudents(students);
        }

 */


   /*
        // find by BirthdateWise

        List<Student> students = studentService.fetchByBirthDate(LocalDate.now());

        if (students.isEmpty())
        {
            System.out.println("No students found for given BirthDate ");
        }
        else
        {
            System.out.println("BirthDate wise List of students");
            MyRunner.printStudents(students);
        }

    */

        // find by BirthDate  Greater than give date

        List<Student> students = studentService.fetchByBirthDateGreaterThan(LocalDate.of(2002,05,15));

        if(students.isEmpty())
        {
            System.out.println("not found greater than this date");
        }
        else
        {
            System.out.println("found students greater than this date");
            MyRunner.printStudents(students);
        }
    }
}
