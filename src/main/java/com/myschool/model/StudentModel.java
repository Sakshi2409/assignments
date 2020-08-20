package com.myschool.model;

public class StudentModel {
	
	private int studentID;
	
	private String studentName;
	
	private int inClass;

	public StudentModel() {
		super();
	}

	public StudentModel(int studentID, String studentName, int inClass) {
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

	public int getInClass() {
		return inClass;
	}

	public void setInClass(int inClass) {
		this.inClass = inClass;
	}
	
	

}
