package com.pms.client.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import com.pms.client.entity.College;
import com.pms.client.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService service;
	@GetMapping("/college")
	 public List<College> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/college/{id}")
	 public ResponseEntity<College> get(@PathVariable Long id) 
	 {
	 try
	 {
		 College college = service.get(id);
	 return new ResponseEntity<College>(college, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/college")
	 public void add(@RequestBody College college) 
	 {
	
	service.save(college);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/college/{id}")
	 public ResponseEntity<?> update(@RequestBody College college, @PathVariable Long id) 
	 {
	 try
	 {
		 
	 service.save(college);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/college/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
}
