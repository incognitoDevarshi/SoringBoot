package com.pms.client.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.client.entity.User;
import com.pms.client.repository.UserRepository;
@Service

public class UserService {

	@Autowired
	 private UserRepository repo;
	 

	 public void save(User user) 
	 {
	 repo.save(user);
	 }

	 
	 public void delete(Integer id) 
	 {
	repo.deleteById(id);
	 }
}
