package com.pms.client.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.client.entity.Placement;
import com.pms.client.repository.PlacementRepository;
@Service

public class PlacementService {

	@Autowired
	 private PlacementRepository repo;
	 
	 public List<Placement> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Placement placement) 
	 {
	 repo.save(placement);
	 }
	 
	 public Placement get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	repo.deleteById(id);
	 }
}
