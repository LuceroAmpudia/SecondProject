package com.bootcamp.serviceimplement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bootcamp.entity.LessonStudent;

import com.bootcamp.repository.LessonStudentRepository;
import com.bootcamp.service.LessonStudentService;


@Service
public class LessonStudentServiceImplement implements LessonStudentService{

	@Autowired
	private LessonStudentRepository lessonStudentRepository;
	
	@Override
	public List<LessonStudent> findAll(LessonStudent pattern) {

			return lessonStudentRepository.findAll();
		}

	


}
