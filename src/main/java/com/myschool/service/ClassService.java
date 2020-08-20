package com.myschool.service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myschool.entity.Class;
import com.myschool.entity.Period;
import com.myschool.entity.Student;

import com.myschool.model.ClassModel;
import com.myschool.repository.ClassRepository;


@Service
public class ClassService {
	
	@Autowired
	private ClassRepository classRepo;

	
	 @Transactional public List<ClassModel> getAllClasses(){
		
		List<ClassModel> classModelList = new ArrayList<>();
		
		List<Class> classEntity = classRepo.findAll();
		
		for(Class c:classEntity) {
			ClassModel temp = new ClassModel();
			
			temp.setClassID(c.getClassID());
			
			List<String> studentNames = new ArrayList<>();
			for(Student s:c.getEnrolledStudents()) {
				studentNames.add(s.getStudentName());
			}
			temp.setEnrolledStudents(studentNames);
			
			List<String> subjects = new ArrayList<>();
			for(Period p:c.getPeriods()) {
				subjects.add(p.getAllottedSubject().getSubjectName());
			}
			temp.setSubjectInPeriod(subjects);
			
			classModelList.add(temp);
		}
		
		return classModelList;
		
	}
	


}
