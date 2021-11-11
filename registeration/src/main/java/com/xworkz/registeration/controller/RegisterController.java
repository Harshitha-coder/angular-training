package com.xworkz.registeration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.registeration.dto.RegisterDTO;
import com.xworkz.registeration.entity.RegisterEntity;
import com.xworkz.registeration.service.RegisterService;

import lombok.extern.log4j.Log4j;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Log4j
public class RegisterController {

	@Autowired
	private RegisterService service;

	@PostMapping("/save")
	public boolean save(@RequestBody RegisterDTO dto) {

		log.info("data is saved successfully");
		return this.service.validateAndSave(dto);
	}

	@GetMapping("/getAll")
	public List<RegisterEntity> getAll() {
		log.info("data is fetched successfully");
		return service.validateAndgetAll();
	}

	@GetMapping("/get/{id}")
	public RegisterEntity getById(@PathVariable int id) {
		log.info("data is fetched successfully by id");
		return service.validateAndGetById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		log.info("data is deleted by id");
		this.service.validateAndDeleteById(id);
	}

	@PutMapping("/update/{id}")
	public void updateById(@PathVariable int id, @RequestBody RegisterDTO dto) {
		log.info("data is updated by id");
		this.service.validateAndUpdatebyId(dto, id);
	}
}
