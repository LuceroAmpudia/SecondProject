package com.bootcamp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.LessonStudent;
import com.bootcamp.service.LessonStudentService;



@RestController
@RequestMapping("/lessonStudent")
public class LessonStudentRest {

	@Autowired
	private LessonStudentService lessonStudentService;
	
	@GetMapping
	public List<LessonStudent> findAll()
	{
		return lessonStudentService.findAll();
	}
	
	
	
}
