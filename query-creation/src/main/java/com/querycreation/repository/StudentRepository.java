package com.querycreation.repository;

import com.querycreation.entity.Gender;
import com.querycreation.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
    public List<Student> findByGender(Gender gender);

    public List<Student> findByBirthDate(LocalDate d);

    public List<Student> findByBirthDateGreaterThan(LocalDate d);
}
