package com.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	Teacher findByTeacherIDTeacherName(int teacherID, String teacherName);

}
