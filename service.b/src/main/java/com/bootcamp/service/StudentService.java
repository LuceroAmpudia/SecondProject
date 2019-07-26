package com.bootcamp.service;

import java.util.List;
import java.util.Optional;

import com.bootcamp.entity.Student;


public interface StudentService {

	Optional<Student> get(Integer idStudent);
	Student save(Student pattern);
	List<Student> findAll();
	Student update (Student pattern);
	void delete(Integer idStudent);
}
