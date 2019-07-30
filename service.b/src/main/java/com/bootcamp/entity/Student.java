package com.bootcamp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="student") //With this annotation I create my table in the database
public class Student {
	
	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idStudent;
	
	// With the annotation @Column I name each column of the database
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	@NotBlank
	private String gender;
	
	@Column(name = "nivel")
	@NotBlank
	private String nivel;
	
	@Column(name="grade")
	private String grade;

	@Column(name="clase")
	private String lessonNameSt;
	
	
	
	
	

	// Here the getters and setters are generated
	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLessonNameSt() {
		return lessonNameSt;
	}

	public void setLessonNameSt(String lessonNameSt) {
		this.lessonNameSt = lessonNameSt;
	}
	
	
	
	
	
	
	
}
