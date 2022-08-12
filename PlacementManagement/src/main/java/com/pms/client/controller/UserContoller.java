package com.pms.client.controller;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pms.client.entity.User;
import com.pms.client.service.UserService;

@RestController 
public class UserContoller {


	@Autowired
	private UserService service;
	
	 @PostMapping("/user")
	 public void add(@RequestBody User user) 
	 {
	
	service.save(user);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/user/{id}")
	 public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) 
	 {
	 try
	 {
		 
	 service.save(user);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/user/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
	
}
