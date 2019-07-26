package com.bootcamp.entity;

public class StudentLesson {

	private Student student;
	private int idStudentLesson;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getIdStudentLesson() {
		return idStudentLesson;
	}
	public void setIdStudentLesson(int idStudentLesson) {
		this.idStudentLesson = idStudentLesson;
	}
	
	
	public StudentLesson(Student student, int idStudentLesson) {
		super();
		this.student = student;
		this.idStudentLesson = idStudentLesson;
	}
	public StudentLesson() {

	}
	
	
}
