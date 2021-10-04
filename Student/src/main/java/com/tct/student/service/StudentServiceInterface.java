package com.tct.student.service;

import java.util.List;

import com.tct.student.model.Student;

public interface StudentServiceInterface {

	public Student addStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(Long idL);

	public void deleteStudentById(Long idL);
}
