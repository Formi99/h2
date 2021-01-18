package com.engProject.h2.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.engProject.h2.model.Student;



public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	List<Student> findByClassroom(String classroom);
	
	//metodo creato per togliere come risultato l'optional
	Student findByIdS(int id) throws ServiceException;
	
	
}