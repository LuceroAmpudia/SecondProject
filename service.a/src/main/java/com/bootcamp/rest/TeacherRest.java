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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.Teacher;
import com.bootcamp.service.TeacherService;


@RestController
@RequestMapping("/teacher")
public class TeacherRest {

	@Autowired
	TeacherService teacherService;
	
	@GetMapping("/{idTeacher}")
	public Optional<Teacher> get(@PathVariable("idTeacher") Integer idTeacher)
	{
		return teacherService.get(idTeacher);
	}
	
	@PostMapping
	public Teacher save(@RequestBody Teacher teacher)
	{
		return teacherService.save(teacher);
	}
	
	@GetMapping
	public List<Teacher> findAll()
	{
		return teacherService.findAll(null);
	}
	
	
	@DeleteMapping("/{idTeacher}")
	public void delete(@PathVariable("idTeacher") Integer idTeacher)
	{
		teacherService.delete(idTeacher);
	}
	
	
	@PutMapping
	public Teacher update(@RequestBody Teacher teacher)
	{
		return teacherService.update(teacher);
	}
	
}
