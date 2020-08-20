package com.myschool.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherID;
	
	private String teacherName;
	
	@OneToMany
	@JoinTable(name="Subjects_Taught",joinColumns = @JoinColumn(name = "teacherID"),inverseJoinColumns = @JoinColumn(name="subjectID"))
	List<Subject> teachingSubjects;

	public Teacher() {
		super();
	}

	public Teacher(int teacherID, String teacherName, List<Subject> teachingSubjects) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.teachingSubjects = teachingSubjects;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<Subject> getTeachingSubjects() {
		return teachingSubjects;
	}

	public void setTeachingSubjects(List<Subject> teachingSubjects) {
		this.teachingSubjects = teachingSubjects;
	}
	

}
