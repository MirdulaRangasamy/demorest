package com.exterro.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int rollNo;
	private String name;
	private float grade;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public Student(int rollNo, String name, float grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
