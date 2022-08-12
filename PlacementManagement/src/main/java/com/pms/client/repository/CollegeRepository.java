package com.pms.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.client.entity.College;

public interface CollegeRepository extends JpaRepository<College,Long> {

	
}
