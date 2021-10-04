package com.tct.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tct.student.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
