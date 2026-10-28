package com.primarykeygenerationtype8.repository;

import com.primarykeygenerationtype8.enitty.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
