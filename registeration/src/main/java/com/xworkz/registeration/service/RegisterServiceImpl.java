package com.xworkz.registeration.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.registeration.dto.RegisterDTO;
import com.xworkz.registeration.entity.RegisterEntity;
import com.xworkz.registeration.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository repository;
	
	@Override
	public void validateAndSave(RegisterDTO dto) {
		RegisterEntity entity=new RegisterEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean flag=false;
		if(entity.getName()!=null&&!entity.getName().isEmpty()) {
			flag=true;
		}else
		{
			flag=false;
		}
		if(entity.getEmail()!=null&&!entity.getEmail().isEmpty()) {
			flag=true;
		}else
		{
			flag=false;
		}
		if(entity.getPassword()!=null&&!entity.getPassword().isEmpty()) {
			flag=true;
		}else
		{
			flag=false;
		}
		repository.save(entity);
		
	}

}
