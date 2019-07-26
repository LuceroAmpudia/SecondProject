package com.bootcamp.serviceimplement;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.stereotype.Service;


import com.bootcamp.entity.LessonStudent;
import com.bootcamp.service.LessonStudentService;


@Service
public class LessonStudentServiceImplement implements LessonStudentService{


	
	@Override
	public List<LessonStudent> findAll() {
	
//		Lesson idLesson = null;
//		Student idStudent=null;
		return findAll().stream().map(s-> new LessonStudent()).collect(Collectors.toList());
	}

}
