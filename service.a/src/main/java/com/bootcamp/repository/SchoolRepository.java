package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entity.School;


public interface SchoolRepository extends JpaRepository<School, Integer>{

}
