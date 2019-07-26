package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entity.LessonStudent;

public interface LessonStudentRepository extends JpaRepository<LessonStudent, Integer> {

}
