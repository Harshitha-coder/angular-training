package com.xworkz.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xworkz.airlines.entity.AirlinesEntity;

public interface AirlinesRepository extends JpaRepository<AirlinesEntity, Integer>{

	public AirlinesEntity getByOwner(String owner);
	
	public AirlinesEntity getByNationality(String nationality);
	
//	@Query(value = "DELETE FROM AirlinesEntity a WHERE a.name = :name")
//	public AirlinesEntity deleteByName(String name);
}
