package com._8pkgenerationtypes.repository;

import com._8pkgenerationtypes.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
