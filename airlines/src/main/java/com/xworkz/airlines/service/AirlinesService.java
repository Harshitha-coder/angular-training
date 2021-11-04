package com.xworkz.airlines.service;

import java.util.List;

import com.xworkz.airlines.dto.AirlinesDTO;
import com.xworkz.airlines.entity.AirlinesEntity;

public interface AirlinesService {

	public boolean validateandSave(AirlinesDTO airlinesDTO);

	public List<AirlinesEntity> validateandGetAll();
	
	public AirlinesEntity validateAndGetByOwner(String owner);
	
	public AirlinesEntity validateAndGetByNationality(String nationality);
	
	//public AirlinesEntity validateAndDeleteByName(String name);
}

