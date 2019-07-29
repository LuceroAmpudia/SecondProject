package com.bootcamp.client;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bootcamp.entity.Student;

@FeignClient(name="servicio-student")
public interface StudentClientRest {

	
	@GetMapping("/get")
	public List<Student> findAll();

	@GetMapping("/get/{idStudent}")
	public Optional<Student> get(@PathVariable("idStudent") Integer idStudent);
}
