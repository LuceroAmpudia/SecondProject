package com.bootcamp.service;

import java.util.List;

import com.bootcamp.entity.LessonStudent;


public interface LessonStudentService {

	List<LessonStudent> findAll(LessonStudent pattern);
	LessonStudent save(LessonStudent pattern);

}
