package com.myschool.model;

import java.util.List;

public class PeriodModel {
	
	private int periodID;
	
	private int classID;
	
	List <String> allottedSubject;

	public PeriodModel() {
		super();
	}

	public PeriodModel(int periodID, int classID, List<String> allottedSubject) {
		super();
		this.periodID = periodID;
		this.classID = classID;
		this.allottedSubject = allottedSubject;
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

	public List<String> getAllottedSubject() {
		return allottedSubject;
	}

	public void setAllottedSubject(List<String> allottedSubject) {
		this.allottedSubject = allottedSubject;
	}

	
	
}
