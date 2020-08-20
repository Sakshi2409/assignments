package com.myschool.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "class")
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classID;
	
	@OneToMany
	@JoinTable(name="Students_In_Class",joinColumns = @JoinColumn(name = "classID"),inverseJoinColumns = @JoinColumn(name="studentID"))
	List<Student> totalStudents;
	
	@OneToMany
	@JoinTable(name="Periods_In_Class",joinColumns = @JoinColumn(name = "classID"),inverseJoinColumns = @JoinColumn(name="periodID"))
	List<Period> periods;

	public Class() {
		super();
	}

	public Class(int classID, List<Student> totalStudents, List<Period> periods) {
		super();
		this.classID = classID;
		this.totalStudents = totalStudents;
		this.periods = periods;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public List<Student> getEnrolledStudents() {
		return totalStudents;
	}

	public void setEnrolledStudents(List<Student> totalStudents) {
		this.totalStudents = totalStudents;
	}

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	
	}

	

