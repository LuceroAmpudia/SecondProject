package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entity.Subject;


public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
