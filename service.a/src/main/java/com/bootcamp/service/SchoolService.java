package com.bootcamp.service;

import java.util.List;
import java.util.Optional;

import com.bootcamp.entity.School;



public interface SchoolService {

	Optional<School> get(Integer idSchool);
	School save(School pattern);
	List<School> findAll(School pattern);
	School update (School pattern);
	void delete(Integer idSchool);
}
