package com.pms.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.client.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
