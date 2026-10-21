package com.queryanotation.repository;

import com.queryanotation.entity.Gender;
import com.queryanotation.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentRepository extends CrudRepository<Student, Integer>
{

    @Query("select s from Student s")  //JPQL QUERY
    //@Query(value="select s from Student s",nativeQuery=false) // SQL QUERY
    List<Student> findAllUsingJPQL();

    //SQL QUERY
    @Query(value = "select * from student", nativeQuery = true)
    List<Student> findAllUsingSQL();

   // @Query("select s from Student s WHERE s.per>=?1 AND s.per<=?2 ") // JPQL with positional parameter
   @Query("select s from Student s WHERE s.per>=:low AND s.per<=:high ")  // JPQL with Named parameter
    List<Student> findPercentageRangeUsingJPQL(@Param("low") Double start, @Param("high") Double end);

//    @Query(value = "select * from student WHERE per>=?1 AND per<=?2", nativeQuery = true) // SQL with positional parameter
    @Query(value = "select * from student WHERE per>=:low AND per<=:high", nativeQuery = true) // SQL with named parameter
    List<Student> findPercentageRangeUsingSQL(@Param("low") Double start, @Param("high") Double end);





    //@Query(value = "SELECT gender,name,per FROM student WHERE per>=:per AND gender=:gender",nativeQuery = true) // Scaler Projection with SQL

    @Query("SELECT s.gender,s.name,s.per FROM Student s WHERE s.per>=:per AND s.gender=:gender")  // Scaler Projection with JPQL
    List<Object[]> findGenderNamePer(@Param("per") Double per, @Param("gender") Gender gender);
}
