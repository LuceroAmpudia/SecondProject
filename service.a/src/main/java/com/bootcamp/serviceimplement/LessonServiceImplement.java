package com.bootcamp.serviceimplement;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Lesson;
import com.bootcamp.repository.LessonRepository;
import com.bootcamp.service.LessonService;



@Service
public class LessonServiceImplement implements LessonService {

	@Autowired
	private LessonRepository lessonRepository;
	
	
	@Override
	public Optional<Lesson> get(Integer idLesson) {
		return lessonRepository.findById(idLesson);
	}

	@Override
	public Lesson save(Lesson pattern) {
		return lessonRepository.save(pattern);
	}

	@Override
	public List<Lesson> findAll(Lesson pattern) {
		return lessonRepository.findAll();
	}

	@Override
	public Lesson update(Lesson pattern) {
		return lessonRepository.save(pattern);
	}

	@Override
	public void delete(Integer idLesson) {
		lessonRepository.deleteById(idLesson);

	}
	
	


}
