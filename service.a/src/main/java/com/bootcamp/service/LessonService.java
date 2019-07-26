package com.bootcamp.service;

import java.util.List;
import java.util.Optional;

import com.bootcamp.entity.Lesson;


public interface LessonService {

	Optional<Lesson> get(Integer idLesson);
	Lesson save(Lesson pattern);
	List<Lesson> findAll(Lesson pattern);
	Lesson update (Lesson pattern);
	void delete(Integer idLesson);

	
}
