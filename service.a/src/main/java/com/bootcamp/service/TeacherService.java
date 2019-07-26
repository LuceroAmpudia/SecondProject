package com.bootcamp.service;

import java.util.List;
import java.util.Optional;

import com.bootcamp.entity.Teacher;


public interface TeacherService {
	Optional<Teacher> get(Integer idTeacher);
	Teacher save(Teacher pattern);
	List<Teacher> findAll(Teacher pattern);
	Teacher update (Teacher pattern);
	void delete(Integer idParent);
}
