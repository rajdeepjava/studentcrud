package com.tct.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tct.student.model.Student;
import com.tct.student.service.StudentServiceInterface;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceInterface studentServiceInterface;
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
	Student studentsaved=studentServiceInterface.addStudent(student);
		return new ResponseEntity<Student>(studentsaved,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> listOfAllStudents=studentServiceInterface.getAllStudent();
		return new ResponseEntity<List <Student>>(listOfAllStudents,HttpStatus.OK);
	}
	@GetMapping("/{idL}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long idL){
		Student studentRetrieve=studentServiceInterface.getStudentById(idL);
		return new ResponseEntity<Student>(studentRetrieve,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{idL}")
	public ResponseEntity<Void> deleteStudentById(@PathVariable Long idL){
		studentServiceInterface.deleteStudentById(idL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		Student studentsaved=studentServiceInterface.addStudent(student);
		return new ResponseEntity<Student>(studentsaved,HttpStatus.CREATED);
	}
	
}
