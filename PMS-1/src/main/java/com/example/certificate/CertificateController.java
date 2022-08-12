package com.example.certificate;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService service;
	@GetMapping("/certificate")
	 public List<Certificate> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/certificate/{id}")
	 public ResponseEntity<Certificate> get(@PathVariable Long id) 
	 {
	 try
	 {
		 Certificate certificate = service.get(id);
	 return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/certificate")
	 public void add(@RequestBody Certificate certificate) 
	 {
	
	service.save(certificate);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/certificate/{id}")
	 public ResponseEntity<?> update(@RequestBody Certificate certificate, @PathVariable Long id) 
	 {
	 try
	 {
		 
	 service.save(certificate);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/certificate/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
	
}
