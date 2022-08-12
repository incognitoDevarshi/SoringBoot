package com.pms.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.client.entity.Certificate;
import com.pms.client.repository.CertificateRepository;

@Service
public class CertificateService {

	@Autowired
	 private CertificateRepository repo;
	 
	 public List<Certificate> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Certificate certificate) 
	 {
	 repo.save(certificate);
	 }
	 
	 public Certificate get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	repo.deleteById(id);
	 }
}
