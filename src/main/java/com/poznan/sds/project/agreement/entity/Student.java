package com.poznan.sds.project.agreement.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	// hash of password is stored in a SQL table --> hashcode()
	private int password;
	private String email;
	private Date dateOfBirth;
	private String nationality;
	private String sex;
	private String studyCycle;
	private String fieldOfEducation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStudyCycle() {
		return studyCycle;
	}

	public void setStudyCycle(String studyCycle) {
		this.studyCycle = studyCycle;
	}

	public String getFieldOfEducation() {
		return fieldOfEducation;
	}

	public void setFieldOfEducation(String fieldOfEducation) {
		this.fieldOfEducation = fieldOfEducation;
	}
	
}
