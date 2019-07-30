package com.bootcamp.service;

import java.util.List;

import com.bootcamp.entity.LessonStudent;


public interface LessonStudentService {

	public List<LessonStudent> findAll(LessonStudent pattern);

}
