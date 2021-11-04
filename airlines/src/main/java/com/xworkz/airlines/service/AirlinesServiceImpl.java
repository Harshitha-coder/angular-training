package com.xworkz.airlines.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xworkz.airlines.dto.AirlinesDTO;
import com.xworkz.airlines.entity.AirlinesEntity;
import com.xworkz.airlines.repository.AirlinesRepository;

@Service
public class AirlinesServiceImpl implements AirlinesService {

	@Autowired
	public AirlinesRepository airlinesRepository;

	@Override
	public boolean validateandSave(AirlinesDTO airlinesDTO) {

		AirlinesEntity entity = new AirlinesEntity();
		BeanUtils.copyProperties(airlinesDTO, entity);
		boolean flag = false;
		//StringUtils.isEmpty(entity)
		if (entity.getName()!= null && !entity.getName().isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		if (entity.getOwner() != null && !entity.getOwner().isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		if (entity.getNationality() != null && !entity.getNationality().isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		airlinesRepository.save(entity);
		return flag;
	}
	/*
	 * @Override public void validateandSaveAll(AirlinesDTO dto) {
	 * 
	 * AirlinesEntity entity=new AirlinesEntity(); List<AirlinesDTO> list=new
	 * ArrayList<>(); airlinesRepository.saveAll().forEach(list::add); }
	 */

	@Override
	public List<AirlinesEntity> validateandGetAll() {
		List<AirlinesEntity> airlines = new ArrayList<>();
		airlinesRepository.findAll().forEach(airlines::add);
		return airlines;
	}

	@Override
	public AirlinesEntity validateAndGetByOwner(String owner) {
		AirlinesEntity fetchedOwner = airlinesRepository.getByOwner(owner);
		return fetchedOwner;
	}

	@Override
	public AirlinesEntity validateAndGetByNationality(String nationality) {
		AirlinesEntity fetchedNationality = airlinesRepository.getByNationality(nationality);
		return fetchedNationality;
	}

//	@Override
//	public AirlinesEntity validateAndDeleteByName(String name) {
//		return airlinesRepository.deleteByName(name);
//	}

}
