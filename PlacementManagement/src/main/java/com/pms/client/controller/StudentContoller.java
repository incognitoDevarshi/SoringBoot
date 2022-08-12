package com.pms.client.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.pms.client.entity.Student;
import com.pms.client.service.StudentService;


@RestController
public class StudentContoller {


	@Autowired
	private StudentService service;
	@GetMapping("/student")
	 public List<Student> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/student/{id}")
	 public ResponseEntity<Student> get(@PathVariable Long id) 
	 {
	 try
	 {
		 Student student = service.get(id);
	 return new ResponseEntity<Student>(student, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/student")
	 public void add(@RequestBody Student student) 
	 {
	
	service.save(student);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/student/{id}")
	 public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Long id) 
	 {
	 try
	 {
		 
	 service.save(student);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/student/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }

	
}
