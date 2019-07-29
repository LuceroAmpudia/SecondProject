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

import com.bootcamp.entity.School;
import com.bootcamp.service.SchoolService;




@RestController
@RequestMapping("/school")
public class SchoolRest {

	@Autowired
	SchoolService schoolService;
	
	@GetMapping("/{idSchool}")
	public Optional<School> get(@PathVariable("idSchool") Integer idSchool)
	{
		return schoolService.get(idSchool);
	}
	
	@PostMapping
	public School save(@RequestBody School school)
	{
		return schoolService.save(school);
	}
	
	@GetMapping
	public List<School> findAll()
	{
		return schoolService.findAll(null);
	}
	
	
	@DeleteMapping("/{idSchool}")
	public void delete(@PathVariable("idSchool") Integer idSchool)
	{
		schoolService.delete(idSchool);
	}
	
	
	@PutMapping
	public School update(@RequestBody School idSchool)
	{
		return schoolService.update(idSchool);
	}
	
}
