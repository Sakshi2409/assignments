package com.myschool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

	public List<Subject> findBySubjectName(String name);
	
}
