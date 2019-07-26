package com.bootcamp.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Teacher;
import com.bootcamp.repository.TeacherRepository;
import com.bootcamp.service.TeacherService;

@Service
public class TeacherServiceImplement implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Optional<Teacher> get(Integer idTeacher) {
		return teacherRepository.findById(idTeacher);
	}

	@Override
	public Teacher save(Teacher pattern) {
		return teacherRepository.save(pattern);
	}

	@Override
	public List<Teacher> findAll(Teacher pattern) {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher update(Teacher pattern) {
		return teacherRepository.save(pattern);
	}

	@Override
	public void delete(Integer idTeacher) {
		teacherRepository.deleteById(idTeacher);

	}
}
