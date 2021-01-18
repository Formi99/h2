package com.engProject.h2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.engProject.h2.dao.StudentRepository;
import com.engProject.h2.model.Student;
import com.engProject.h2.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "Student Saved...";
		
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudent(){
		//return studentRepository.findAll();
		return this.studentService.findAll();
	}
	
	@GetMapping("/getStudentByClassroom/{classroom}")
	public List<Student> getStudentByClassroom(@PathVariable String classroom){
		return this.studentService.findByClassroom(classroom);
		
	}
	
	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getStudentById(@PathVariable int id){
		return this.studentService.findByIdStudent(id);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return this.studentService.deleteStudentById(id);
	}
	
}