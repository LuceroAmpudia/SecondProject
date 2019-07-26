package com.bootcamp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer>{



}
