package com.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.entity.Class;

public interface ClassRepository extends JpaRepository<Class, Integer> {

}
