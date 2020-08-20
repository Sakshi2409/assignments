package com.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.entity.Period;


public interface PeriodRepository extends JpaRepository<Period, Integer> {

	Object getTeacherNames();

	
}
