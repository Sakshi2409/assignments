package com.myschool.model;

public class SubjectModel {
	
	private int subjectID;
	
	private String subjectName;
	
	private String teacher;
	
	private int periodID;
	
	private int classID;

	public SubjectModel() {
		super();
	}

	public SubjectModel(int subjectID, String subjectName, String teacher, int periodID, int classID) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.teacher = teacher;
		this.periodID = periodID;
		this.classID = classID;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getPeriodID() {
		return periodID;
	}

	public void setPeriodID(int periodID) {
		this.periodID = periodID;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}
	

	
}
