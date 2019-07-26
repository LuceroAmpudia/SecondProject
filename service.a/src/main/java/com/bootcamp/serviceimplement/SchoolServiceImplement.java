package com.bootcamp.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.School;
import com.bootcamp.repository.SchoolRepository;
import com.bootcamp.service.SchoolService;



@Service
public class SchoolServiceImplement implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	public Optional<School> get(Integer idSchool) {
		return schoolRepository.findById(idSchool);
	}

	@Override
	public School save(School pattern) {
		return schoolRepository.save(pattern);
	}

	@Override
	public List<School> findAll(School pattern) {
		return schoolRepository.findAll();
	}

	@Override
	public School update(School pattern) {
		return schoolRepository.save(pattern);
	}

	@Override
	public void delete(Integer idSchool) {
		schoolRepository.deleteById(idSchool);

	}
}
