package com.bootcamp.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Subject;
import com.bootcamp.repository.SubjectRepository;
import com.bootcamp.service.SubjectService;


@Service
public class SubjectServiceImplement implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public Optional<Subject> get(Integer idSubject) {
		return subjectRepository.findById(idSubject);
	}

	@Override
	public Subject save(Subject pattern) {
		return subjectRepository.save(pattern);
	}

	@Override
	public List<Subject> findAll(Subject pattern) {
		return subjectRepository.findAll();
	}

	@Override
	public Subject update(Subject pattern) {
		return subjectRepository.save(pattern);
	}

	@Override
	public void delete(Integer idSubject) {
		subjectRepository.deleteById(idSubject);

	}
}
