package com.bootcamp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "lesson") //With this annotation I create my table in the database
public class Lesson {

	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLesson;
	
	// With the annotation @Column I name each column of the database
	@Column(name ="classes_code")
	private String lessonCode;
	
	@Column(name ="classes_name")
	private String lessonName;
	
	@Column(name ="date_from")
	@Temporal(TemporalType.DATE)
	private Date dateFrom;
	
	@Column(name ="date_to")
	@Temporal(TemporalType.DATE)
	private Date dateTo;

	// With the annotation @ManyToOne I establish the relationship of many with one.
		@ManyToOne                   
		@JoinColumn(name="id_teacher",referencedColumnName = "idTeacher")	
		private Teacher idTeacher;

		@ManyToOne                   
		@JoinColumn(name="id_subject",referencedColumnName = "idSubject")	
		private Subject idSubject;

		
		// Here the getters and setters are generated
		

		public int getIdLesson() {
			return idLesson;
		}



		public void setIdLesson(int idLesson) {
			this.idLesson = idLesson;
		}



		public String getLessonCode() {
			return lessonCode;
		}



		public void setLessonCode(String lessonCode) {
			this.lessonCode = lessonCode;
		}



		public String getLessonName() {
			return lessonName;
		}



		public void setLessonName(String lessonName) {
			this.lessonName = lessonName;
		}



		public Date getDateFrom() {
			return dateFrom;
		}

		public void setDateFrom(Date dateFrom) {
			this.dateFrom = dateFrom;
		}

		public Date getDateTo() {
			return dateTo;
		}

		public void setDateTo(Date dateTo) {
			this.dateTo = dateTo;
		}

		public Teacher getIdTeacher() {
			return idTeacher;
		}

		public void setIdTeacher(Teacher idTeacher) {
			this.idTeacher = idTeacher;
		}

		public Subject getIdSubject() {
			return idSubject;
		}

		public void setIdSubject(Subject idSubject) {
			this.idSubject = idSubject;
		}

	
	
	
}
