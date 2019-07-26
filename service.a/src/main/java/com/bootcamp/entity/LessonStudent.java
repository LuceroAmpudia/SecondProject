package com.bootcamp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "lesson_student")
public class LessonStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLessonStudent;
	

	@ManyToOne
	@JoinColumn(name = "id_lesson", referencedColumnName = "idLesson")
	private Lesson idLesson;
	
//	@ManyToOne
//	@JoinColumn(name = "id_student")
//	@Column(name = "id_student")
//	private Student idStudent;

	public int getIdLessonStudent() {
		return idLessonStudent;
	}

	public void setIdLessonStudent(int idLessonStudent) {
		this.idLessonStudent = idLessonStudent;
	}

	public Lesson getIdLesson() {
		return idLesson;
	}

	public void setIdLesson(Lesson idLesson) {
		this.idLesson = idLesson;
	}

	
//	public Student getIdStudent() {
//		return idStudent;
//	}
//
//	public void setIdStudent(Student idStudent) {
//		this.idStudent = idStudent;
//	}

	public LessonStudent() {

	}

//	public LessonStudent(int idLessonStudent, Lesson idLesson, Student idStudent) {
//		this.idLessonStudent = idLessonStudent;
//		this.idLesson = idLesson;
//		this.idStudent = idStudent;
//	}



	
	
	
	
	
	
	
	
}
