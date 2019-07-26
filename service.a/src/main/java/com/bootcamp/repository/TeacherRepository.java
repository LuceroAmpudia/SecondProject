package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entity.Teacher;



public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
