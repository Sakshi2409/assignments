package com.myschool.entity;

import javax.persistence.*;

@Entity
@Table(name = "period")
public class Period {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int periodID;
	
	@ManyToOne
	private Class belongsToClass;
	
	@OneToOne(mappedBy = "inPeriod")
	@JoinColumn(name = "subject_id")
	private Subject allottedSubject;

	public Period() {
		super();
	}

	public Period(int periodID, Class belongsToClass, Subject allottedSubject) {
		super();
		this.periodID = periodID;
		this.belongsToClass = belongsToClass;
		this.allottedSubject = allottedSubject;
	}

	public int getPeriodID() {
		return periodID;
	}

	public void setPeriodID(int periodID) {
		this.periodID = periodID;
	}

	public Class getBelongsToClass() {
		return belongsToClass;
	}

	public void setBelongsToClass(Class belongsToClass) {
		this.belongsToClass = belongsToClass;
	}

	public Subject getAllottedSubject() {
		return allottedSubject;
	}

	public void setAllottedSubject(Subject allottedSubject) {
		this.allottedSubject = allottedSubject;
	}

	
}
