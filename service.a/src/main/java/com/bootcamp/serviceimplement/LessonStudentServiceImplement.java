package com.bootcamp.serviceimplement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.client.StudentClientRest;
import com.bootcamp.entity.LessonStudent;
import com.bootcamp.repository.LessonStudentRepository;
import com.bootcamp.service.LessonStudentService;


@Service
public class LessonStudentServiceImplement implements LessonStudentService{

	@Autowired
	private LessonStudentRepository lessonStudentRepository;
	
	@Autowired
	private StudentClientRest studentClientRest;
	
	@Override
	public List<LessonStudent> findAll(LessonStudent pattern) {

		
			//return studentClientRest.findAll().stream().map(s->new LessonStudent()).collect(Collectors.toList()); 
			return	lessonStudentRepository.findAll();
		}

	


}
