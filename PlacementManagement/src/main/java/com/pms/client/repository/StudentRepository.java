package com.pms.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.client.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
