package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entity.Lesson;


public interface LessonRepository extends JpaRepository<Lesson, Integer>{

}
