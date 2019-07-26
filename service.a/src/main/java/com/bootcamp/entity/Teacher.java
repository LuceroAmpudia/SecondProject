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
@Table(name = "teacher")
public class Teacher {
	
	
	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTeacher;
	
	// With the annotation @Column I name each column of the database
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "especialidad")
	private String especialidad;

	// With the annotation @ManyToOne I establish the relationship of many with one.
	@ManyToOne                   
	@JoinColumn(name="id_school",referencedColumnName = "idSchool")	
	private School idSchool;
	
	// Here the getters and setters are generated
	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public School getIdSchool() {
		return idSchool;
	}

	public void setIdSchool(School idSchool) {
		this.idSchool = idSchool;
	}
	
	
	

}
