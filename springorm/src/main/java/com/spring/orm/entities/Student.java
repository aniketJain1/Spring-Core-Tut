package com.spring.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "student_city")
	private String city;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + "]";
	}
	public Student(int studentId, String name, String city) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	

}