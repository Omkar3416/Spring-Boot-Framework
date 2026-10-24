package com.namedqueryannotation6.runner;

import com.namedqueryannotation6.entity.Gender;
import com.namedqueryannotation6.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner
{
    @Autowired
    private StudentService studentService;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        studentService.removeByPerAndGender(76.0, Gender.MALE);
        System.out.println("Record is deleted scussecfully");
    }
}
