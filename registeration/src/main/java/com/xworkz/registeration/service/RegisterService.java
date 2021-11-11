package com.xworkz.registeration.service;

import java.util.List;

import com.xworkz.registeration.dto.RegisterDTO;
import com.xworkz.registeration.entity.RegisterEntity;

public interface RegisterService {

	public RegisterEntity validateAndGetById(int id);

	public boolean validateAndSave(RegisterDTO dto);

	public List<RegisterEntity> validateAndgetAll();

	public void validateAndDeleteById(int id);

	public void validateAndUpdatebyId(RegisterDTO dto, int id);
}
