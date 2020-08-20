package com.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	public Student findByStudentName(String name);
}
