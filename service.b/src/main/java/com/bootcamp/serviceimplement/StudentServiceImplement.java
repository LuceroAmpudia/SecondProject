package com.bootcamp.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Student;
import com.bootcamp.repository.StudentRepository;
import com.bootcamp.service.StudentService;



@Service
public class StudentServiceImplement implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Optional<Student> get(Integer idStudent) {
		return studentRepository.findById(idStudent);
	}

	@Override
	public Student save(Student pattern) {
		return studentRepository.save(pattern);
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student update(Student pattern) {
		return studentRepository.save(pattern);
	}

	@Override
	public void delete(Integer idStudent) {
		studentRepository.deleteById(idStudent);

	}

}
