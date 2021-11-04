package com.xworkz.airlines.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.airlines.dto.AirlinesDTO;
import com.xworkz.airlines.entity.AirlinesEntity;
import com.xworkz.airlines.service.AirlinesService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class AirlinesController {

	@Autowired
	public AirlinesService service;
	
	@PostMapping("/save")
	public boolean saveAirlines(@RequestBody AirlinesDTO dto) {
		boolean isSaved = service.validateandSave(dto);
		//System.out.println("data is saved");
		log.info("data is saved");
		return isSaved;
	}

//	@PostMapping("/saveAll")
//	public void saveAllAirlines(@RequestBody AirlinesDTO dto) {
//		service.validateandSaveAll(dto);
//		System.out.println("all data is saved");
//	}

	@GetMapping("/getAll")
	public List<AirlinesEntity> getAllAirlines() {
		//System.out.println("data is fetched");
		log.info("data is fetched");
		return service.validateandGetAll();
		
	}

	@GetMapping("/getOwner/{owner}")
	public AirlinesEntity getByOwner(@PathVariable String owner) {
		//System.out.println("data is fetched by owner");
		log.info("data is fetched by owner");
		return service.validateAndGetByOwner(owner);
	}

	@GetMapping("/getNationality/{nationality}")
	public AirlinesEntity getByNationality(@PathVariable String nationality) {
		//System.out.println("data is fetched by nationality");
		log.info("data is fetched by nationality");
		return service.validateAndGetByNationality(nationality);
	}

//	@DeleteMapping("/deleteByName/{name}")
//	public AirlinesEntity updateByName(@PathVariable String name) {
//		//System.out.println("data is updated by name");
//		log.info(" data is deleted by name");
//		return service.validateAndDeleteByName(name);
//	}

}
