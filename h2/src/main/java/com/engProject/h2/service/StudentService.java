package com.engProject.h2.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;

import com.engProject.h2.model.Student;

public interface StudentService {
		
	List<Student> findByClassroom(String classroom);
	
	List<Student> findAll() throws ServiceException;
	
	Optional<Student> findByIdStudent(int id) throws ServiceException;
	
	Student findByIdS(int id);
	
	Student saveStudent(Student student);
	
	String deleteStudentById(int id);
	
}
