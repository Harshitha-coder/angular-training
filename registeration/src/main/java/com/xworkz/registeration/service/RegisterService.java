package com.xworkz.registeration.service;

import java.util.List;

import com.xworkz.registeration.dto.RegisterDTO;
import com.xworkz.registeration.entity.RegisterEntity;

public interface RegisterService {

	public void validateAndSave(RegisterDTO dto);
	//public List<RegisterEntity> validateAndgetAll();
}
