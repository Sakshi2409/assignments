package com.myschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myschool.entity.Teacher;
import com.myschool.model.TeacherModel;
import com.myschool.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/TeacherM")
	public List<TeacherModel> getAllTeachers(){
		return (List<TeacherModel>) teacherService.getTeacherData(0,List<teacherName>);
		
	}
}
