package com.xworkz.registeration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.registeration.dto.RegisterDTO;
import com.xworkz.registeration.service.RegisterService;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@PostMapping("/save")
	public void save(@RequestBody RegisterDTO dto)
	{
		service.validateAndSave(dto);
		log.info("data is saved successfully");
	}
}
