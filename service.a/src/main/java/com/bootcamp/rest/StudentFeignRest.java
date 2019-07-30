package com.bootcamp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.client.StudentClientRest;
import com.bootcamp.entity.Student;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/studentFeign")
public class StudentFeignRest {

	@Autowired
	private StudentClientRest studentClientRest;
	
	@GetMapping
	public List<Student> findAll()
	{
		return studentClientRest.findAll();
	}
	
	
	@HystrixCommand(fallbackMethod = "metodoAlternativo")
	@GetMapping("/{idStudent}")
	public Optional<Student> get(@PathVariable("idStudent") Integer idStudent) 
	{
		return studentClientRest.get(idStudent);	
	}
	
	public Optional<Student>  metodoAlternativo(@PathVariable("idStudent") Integer idStudent)
	{
		Student student=new Student();

		student.setIdStudent(idStudent);
		student.setFirstName("Lucero");
		student.setLastName("Ampudia");
		student.setGender("Femenino");
		student.setNivel("Secundario");
		student.setGrade("2do");
		student.setLessonName("Algebra");
		
		return Optional.of(student);
	}
	
	
}
