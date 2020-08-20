package com.myschool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myschool.entity.Subject;
import com.myschool.entity.Teacher;
import com.myschool.model.TeacherModel;
import com.myschool.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;
	
	
	public TeacherModel getTeacherData(int teacherID, String teacherName) {
		
		TeacherModel teacherModel = new TeacherModel();
		
		Teacher teacher = teacherRepo.findByTeacherIDTeacherName(teacherID, teacherName);
		List<Subject> subList = teacher.getTeachingSubjects();
		List<String> subTaught = new ArrayList<>();
		List<Integer> classes = new ArrayList<>();
		
		teacherModel.setTeacherID(teacher.getTeacherID());
		teacherModel.setTeacherName(teacher.getTeacherName());
		
		for(Subject s:subList) {
			subTaught.add(s.getSubjectName());
			int classNum = s.getInPeriod().getBelongsToClass().getClassID();
			classes.add(classNum);
		}
		teacherModel.setSubjects(subTaught);
		
		teacherModel.setClasses(classes);
		
		return teacherModel;
		
		
	}





		
	}
	
	
	
	

;
