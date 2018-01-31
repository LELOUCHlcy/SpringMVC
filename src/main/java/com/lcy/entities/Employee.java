package com.lcy.entities;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.util.Date;

public class Employee {

	private Integer id;
	@NotEmpty
	private String lastName;
	@Email
	private String email;
	// 1 male, 0 female
	private Integer gender;
	private Department department;
	@Past
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birth;


	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}



	public Employee(){

	}

	public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(String email, Integer gender, Integer id, String lastName, Department department) {
		this.email = email;
		this.gender = gender;
		this.id = id;
		this.lastName = lastName;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"birth=" + birth +
				", id=" + id +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", gender=" + gender +
				", department=" + department +
				'}';
	}
}
