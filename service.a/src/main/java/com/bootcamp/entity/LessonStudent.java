package com.bootcamp.entity;




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
	@JoinColumn(name = "lesson_Name", referencedColumnName = "lessonName")
	private Lesson lessonName;
	

	//private Student lessonNamest;
	
	public int getIdLessonStudent() {
		return idLessonStudent;
	}

	public void setIdLessonStudent(int idLessonStudent) {
		this.idLessonStudent = idLessonStudent;
	}

	





	
	
	
	
	
	
	
	
}
