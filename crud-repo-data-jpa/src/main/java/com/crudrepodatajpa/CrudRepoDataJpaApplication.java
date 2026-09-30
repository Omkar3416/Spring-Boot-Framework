package com.crudrepodatajpa;

import com.crudrepodatajpa.entity.Gender;
import com.crudrepodatajpa.entity.Student;
import com.crudrepodatajpa.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudRepoDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudRepoDataJpaApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(StudentRepository studentRepository) {
//        return args -> {
//Z
//            studentRepository.save(
//                    new Student(101, "ppp", 60.0, Gender.MALE)
//            );
//
//        };
//    }

}
