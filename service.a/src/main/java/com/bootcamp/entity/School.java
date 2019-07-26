package com.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="school") //With this annotation I create my table in the database
public class School {

	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSchool;
	
	// With the annotation @Column I name each column of the database
	@Column(name = "name_school")
	private String nameSchool;

	
	// Here the getters and setters are generated
	public int getIdSchool() {
		return idSchool;
	}

	public void setIdSchool(int idSchool) {
		this.idSchool = idSchool;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	
	
}
