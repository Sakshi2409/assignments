package com.myschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.myschool.model.PeriodModel;
import com.myschool.service.PeriodService;

@RestController
public class PeriodController {
	
	@Autowired
	private PeriodService periodService;
	
	@GetMapping("/getallperiods")
	public List<PeriodModel> getModels(){
		return periodService.getAllPeriods(List<PeriodModel>);
	}
	

	
	
	
	
	


}
