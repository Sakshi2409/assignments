package com.myschool.model;

import java.util.*;

public class ClassModel {
	
	private int classID;
	
	List<String> enrolledStudents;
	
	List<String> subjectInPeriod;

	public ClassModel() {
		super();
	}

	public ClassModel(int classID, List<String> enrolledStudents, List<String> subjectInPeriod) {
		super();
		this.classID = classID;
		this.enrolledStudents = enrolledStudents;
		this.subjectInPeriod = subjectInPeriod;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public List<String> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<String> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public List<String> getSubjectInPeriod() {
		return subjectInPeriod;
	}

	public void setSubjectInPeriod(List<String> subjectInPeriod) {
		this.subjectInPeriod = subjectInPeriod;
	}
	
	

}
