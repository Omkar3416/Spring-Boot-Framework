package com._8pkgenerationtypes.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="STUDENT")
@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void setRno(Integer rno)
    {
        System.out.println("Omkar Patil");
    } // Reflection API

}
