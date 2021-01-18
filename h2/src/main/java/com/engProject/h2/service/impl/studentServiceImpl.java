package com.engProject.h2.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;

import com.engProject.h2.dao.StudentRepository;
import com.engProject.h2.model.Student;
import com.engProject.h2.service.StudentService;

public class studentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public List<Student> findByClassroom(String classroom) {
		return (List<Student>) studentRepository.findByClassroom(classroom);
	}

	@Override
	public List<Student> findAll() throws ServiceException {
		return studentRepository.findAll();
	}

	//metodo utilizzando il findById dato direttamente da crudRepository
	@Override
	public Optional<Student> findByIdStudent(int id) throws ServiceException {
		return studentRepository.findById(id);
		
	}
	
	@Override
	public Student saveStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	//metodo utilizzando il findById creato nella repository
	@Override
	public Student findByIdS(int id) {
		return studentRepository.findByIdS(id);
		
	}

	@Override
	public String deleteStudentById(int id) {
		studentRepository.deleteById(id);
		return "Student Deleted...";
	}
	
}
