package com.xworkz.registeration.service;

import java.util.ArrayList;
import java.util.List;

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
//	PasswordEncoder passwordEncoder;

	@Override
	public boolean validateAndSave(RegisterDTO dto) {
//		this.passwordEncoder=new BCryptPasswordEncoder();
//		String encodedPassword=this.passwordEncoder.encode(dto.getPassword());
//		dto.setPassword(encodedPassword);
		RegisterEntity entity = new RegisterEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean flag = false;
		if (entity.getName() != null && !entity.getName().isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		if (entity.getEmail() != null && !entity.getEmail().isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		if (entity.getPassword() != null && !entity.getPassword().isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		this.repository.save(entity);
		return flag;

	}

	@Override
	public List<RegisterEntity> validateAndgetAll() {
		List<RegisterEntity> list = new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}

	@Override
	public void validateAndDeleteById(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public void validateAndUpdatebyId(RegisterDTO dto, int id) {
		RegisterEntity entity = new RegisterEntity();
		BeanUtils.copyProperties(dto, entity);
		this.repository.save(entity);

	}

	@Override
	public RegisterEntity validateAndGetById(int id) {

		return this.repository.findById(id).get();
	}

}
