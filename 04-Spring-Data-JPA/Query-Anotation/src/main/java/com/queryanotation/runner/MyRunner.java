package com.queryanotation.runner;

import com.queryanotation.entity.Gender;
import com.queryanotation.entity.Student;
import com.queryanotation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
    public void run(ApplicationArguments args) throws Exception
    {
        /*
         // Get All Students

        List<Student> students = studentService.fetchAllStudent();
        printStudents(students);

         */

        /*
        // Find percentage range student
        List<Student> students = studentService.findPercentageRangeStudent(60.0,80.0);
        printStudents(students);

         */

        List<Object[]> students = studentService.findGenderNamePerStudent(60.0, Gender.MALE);

        for(Object[] ob: students)
        {
            System.out.println("Gender : "+ ob[0]);
            System.out.println("Name :"+ ob[1]);
            System.out.println("Percenttage : "+ob[2]);
            System.out.println("-".repeat(50));
        }

    }
}
