package com.namedqueryannotation6.repository;

import com.namedqueryannotation6.entity.Gender;
import com.namedqueryannotation6.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.per > :per AND s.gender=:gender")
    public void deleteByPerAndGender(@Param("per") Double per, @Param("gender")Gender gender);

}
