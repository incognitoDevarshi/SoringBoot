package com.pms.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.client.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer > {

	
}
