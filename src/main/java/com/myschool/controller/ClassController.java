package com.myschool.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.myschool.model.ClassModel;
import com.myschool.service.ClassService;

@RestController
public class ClassController {
	
@Autowired private ClassService classService;
	
	
	@GetMapping("/getallclasses")
	public List<ClassModel> getAllClasses(){
		return classService.getAllClasses();
	}

}
