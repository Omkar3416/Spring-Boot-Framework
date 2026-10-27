package com.namedqueryannotation7entityclass.repository;

import com.namedqueryannotation7entityclass.entity.Gender;
import com.namedqueryannotation7entityclass.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {


    public List<Student> findAllGreaterThanPerAndGender(@Param("per") Double per, @Param("gender") Gender gender);

    @Modifying
    @Transactional
    public void updateName(@Param("name") String name, @Param("rno") Integer rno);

    public List<Object[]> findGenderAndName();

    public List<Object[]> countByGender();
}
