package com.exterro.demorest;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	private List<Student> studList;
	
	public StudentRepository() {
		studList = new ArrayList<Student>();
		studList.add(new Student(101,"AAA",7.6f));
		studList.add(new Student(102,"Pavan",7.7f));
		studList.add(new Student(103,"Ria",9.2f));
	}
	
	public List<Student> getStudents(){
		return studList;
	}
	
	public Student getStudent(int rollNo) {
		for(Student stud:studList) {
			if(stud.getRollNo() == rollNo) {
				return stud;
			}
		}
		return new Student();
	}
	
	public List<Student> createStudent(Student s) {
		studList.add(s);
		return studList;
	}
	
	public Student updateStudent(int rollNo, Student studNew) {
		for(Student stud:studList) {
			if(stud.getRollNo() == rollNo) {
				studList.remove(stud);
				studList.add(studNew);			
			}
		}
		return studNew;
	}
	
	public String deleteStudent(int rollNo) {
		for(Student stud:studList) {
			if(stud.getRollNo() == rollNo) {
				studList.remove(stud);
				return "Student Deleted";			
			}
		}
		return "Student Not Found";
	}
}
