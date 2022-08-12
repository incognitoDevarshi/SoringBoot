package com.pms.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.client.entity.Placement;
public interface PlacementRepository extends JpaRepository<Placement, Long> 
{
	
}