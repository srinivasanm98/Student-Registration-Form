package com.pack.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="stud100")
public class Student {

	@Id
	private Integer studentid;
	@NotEmpty(message="Name should Not null")
	@Size(min=6,max=25)
	private String name;
	@NotNull(message="Age should Not null")
	@Min(value=20)
	@Max(value=50)
	private Integer age;
	@NotNull(message="Date should Not empty")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dob;
	@NotEmpty(message="Please select any one gender")
	private String gender;
	@NotEmpty(message="Address should Not empty")
	private String address;
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(Integer studentid, String name, Integer age, Date dob, String gender, String address) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
