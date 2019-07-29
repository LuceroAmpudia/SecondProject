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

import com.bootcamp.entity.Lesson;
import com.bootcamp.service.LessonService;

@RestController
@RequestMapping("/lesson")
public class LessonRest {

	@Autowired
	LessonService lessonService;
	
	@GetMapping("/{idLesson}")
	public Optional<Lesson> get(@PathVariable("idLesson") Integer idLesson)
	{
		return lessonService.get(idLesson);
	}
	
	@PostMapping
	public Lesson save(@RequestBody Lesson lesson)
	{
		return lessonService.save(lesson);
	}
	
	@GetMapping
	public List<Lesson> findAll()
	{
		return lessonService.findAll(null);
	}
	
	
	@DeleteMapping("/{idLesson}")
	public void delete(@PathVariable("idLesson") Integer idLesson)
	{
		lessonService.delete(idLesson);
	}
	
	
	@PutMapping
	public Lesson update(@RequestBody Lesson lesson)
	{
		return lessonService.update(lesson);
	}
	
}
