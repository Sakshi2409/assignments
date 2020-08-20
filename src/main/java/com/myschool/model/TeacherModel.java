package com.myschool.model;

import java.util.*;

public class TeacherModel {
	
	private int teacherID;
	
    List<String> teacherName;
	
	List<String> subjects;

	public TeacherModel() {
		super();
	}

	public TeacherModel(int teacherID, List<String> teacherName, List<String> subjects) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.subjects = subjects;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public List<String> getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public void setClasses(List<Integer> classes) {

		
	}
	
	

}
