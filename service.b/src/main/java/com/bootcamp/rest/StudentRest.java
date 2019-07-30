package com.bootcamp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.Student;
import com.bootcamp.service.StudentService;



@RestController
public class StudentRest {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/get/{idStudent}")
	public Optional<Student> get(@PathVariable("idStudent") Integer idStudent) throws Exception
	{
		
//		boolean ok=false;
//		if(ok==false)
//		{
//			throw new Exception("No se puede cargar los datos del estudiante");
//		}
//		
//		try {
//			Thread.sleep(2000L);
//		}catch  (InterruptedException e) {
//			e.printStackTrace();
//		}
		return studentService.get(idStudent);
		
	}
	
	@PostMapping
	public Student save(@RequestBody Student student)
	{
		return studentService.save(student);
		
		
	}
	
	@GetMapping
	public List<Student> findAll()
	{
		return studentService.findAll();
	}
	
	
	@DeleteMapping("/delete/{idStudent}")
	public void delete(@PathVariable("idStudent") Integer idStudent)
	{
		studentService.delete(idStudent);
	}
	
	
	@PutMapping
	public Student update(@RequestBody Student student)
	{
		return studentService.update(student);
	}
	
}
