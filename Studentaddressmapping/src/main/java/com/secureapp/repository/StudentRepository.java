package com.secureapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secureapp.entity.Student;


// first, second and third type
public interface StudentRepository extends JpaRepository<Student, Long> {

}
