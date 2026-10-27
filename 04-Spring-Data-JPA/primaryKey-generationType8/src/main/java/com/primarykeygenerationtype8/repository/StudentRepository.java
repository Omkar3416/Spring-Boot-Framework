package com.primarykeygenerationtype8.repository;

import com.primarykeygenerationtype8.enitty.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student, Integer>
{

}
