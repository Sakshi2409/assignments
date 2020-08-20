package com.myschool.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentID;
	
	private String studentName;
	
	@ManyToOne
	private Class inClass;

	public Student() {
		super();
	}

	public Student(int studentID, String studentName, Class inClass) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.inClass = inClass;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Class getInClass() {
		return inClass;
	}

	public void setInClass(Class inClass) {
		this.inClass = inClass;
	}
	
	

}
