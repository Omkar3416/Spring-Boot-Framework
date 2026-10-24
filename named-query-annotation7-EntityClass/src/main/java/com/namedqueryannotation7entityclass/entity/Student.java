package com.namedqueryannotation7entityclass.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="STUDENT")
@NoArgsConstructor
@AllArgsConstructor
@Data
@NamedQuery(name = "Student.findAllGreaterThanPerAndGender", query =  "SELECT s from Student s where per>=:per AND gender=:gender")
@NamedQuery(name = "Student.updateName",
            query = "UPDATE Student s SET s.name=:name WHERE s.rno=:rno")
@NamedQuery(name="Student.findGenderAndName",
        query = "SELECT s.name, s.gender from Student s")
@NamedQuery(name = "Student.countByGender",
            query = "SELECT s.gender, COUNT(s) FROM Student s GROUP BY s.gender")
public class Student
{
    @Id
    @Column(name="RNO")
    private Integer rno;

    @Column(name="NAME")
    private String name;

    @Column(name="PER")
    private Double per;

    @Enumerated(EnumType.STRING)
    @Column(name="GENDER")
    private Gender gender;

    @Column(name="Birth_Date")
    private LocalDate birthDate;
}
