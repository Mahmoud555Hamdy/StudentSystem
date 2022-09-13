package com.example.StudentSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentSystem.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
 
}