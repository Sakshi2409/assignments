package com.myschool.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.myschool.entity.Class;
import com.myschool.entity.Period;
import com.myschool.entity.Student;
import com.myschool.entity.Subject;
import com.myschool.entity.Teacher;
import com.myschool.model.ClassModel;
import com.myschool.model.PeriodModel;
import com.myschool.model.TeacherModel;
import com.myschool.repository.PeriodRepository;

@Service
public class PeriodService {
	
	@Autowired
	private PeriodRepository PeriRepo ;
	protected Teacher s;
	protected Subject c; 
	
	public PeriodModel getAllPeriods() {
	
		PeriodModel periodModel = new PeriodModel(){
	@Transactional 
	public List<PeriodModel> getAllPeriods(){
		
	
		List<String> subject;
		List<PeriodModel> periodModelList = new ArrayList<>();
		
		List<Period> periodEntity = PeriRepo.findAll();
		
		for(Period p:periodEntity) {
			PeriodModel temp = new PeriodModel();
			
			Period p;
			temp.setPeriodID(p.getPeriodID());
			
			
			List<String> teacherNames = new ArrayList<>();
			for(Teacher t:s.List<getTeacherID>) {
				teacherNames.add(s.getTeacherName());
			}
			
			temp.setAllottedSubject(subject);	
			
			List<String> subjectNames= new ArrayList<>();
			for(Subject s:c.getSubjectID()) {
				subject.add(s.getSubjectName());
				
			}
			
	
		}
		
	}
		
		};
		return periodModel;
	}

	
}

	

	

	
	
		
		
		
		
	

	
