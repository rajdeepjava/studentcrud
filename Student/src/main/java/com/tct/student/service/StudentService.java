package com.tct.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.student.model.Student;
import com.tct.student.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface{

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public Student addStudent(Student student) {

		Student savedStudent=studentRepository.save(student);
		return savedStudent;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long idL) {
		// TODO Auto-generated method stub
		return studentRepository.findById(idL).get();
	}

	@Override
	public void deleteStudentById(Long idL) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(idL);
		
	}

}
