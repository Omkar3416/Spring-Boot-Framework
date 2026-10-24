package com.namedqueryannotation7entityclass.runner;

import com.namedqueryannotation7entityclass.entity.Gender;
import com.namedqueryannotation7entityclass.entity.Student;
import com.namedqueryannotation7entityclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

import static com.namedqueryannotation7entityclass.entity.Gender.FEMALE;
import static com.namedqueryannotation7entityclass.entity.Gender.MALE;

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
        // Find all by Greater that percentage and Gender
        List<Student> students = studentService.fetchAllGreaterThanPerAndGender(70.0, FEMALE);
        printStudents(students);

         */

        /*
        // update student name using roll number
        studentService.modifyStudent("pratiksha",102);

         */

        /*
        List<Object[]> students = studentService.fetchGenderAndName();

        for(Object[] data : students)
        {
            System.out.println("name : " + data[0]);
            System.out.println("Gender : "+ data[1]);
            System.out.println("--".repeat(10));
        }

         */

        List<Object[]> students = studentService.countByGender();

        for(Object[] data : students)
        {
            System.out.println("Gender : " + data[0]);
            System.out.println("Number Of Candidates : "+ data[1]);
            System.out.println("--".repeat(10));
        }
    }
}
