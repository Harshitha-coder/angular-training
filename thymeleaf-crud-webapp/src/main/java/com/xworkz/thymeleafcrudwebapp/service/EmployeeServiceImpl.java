package com.xworkz.thymeleafcrudwebapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.thymeleafcrudwebapp.model.Employee;
import com.xworkz.thymeleafcrudwebapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		return this.repository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.repository.save(employee);

	}

	@Override
	public Employee getById(int id) {
		Optional<Employee> optional=this.repository.findById(id);
		Employee employee=null;
		if(optional.isPresent())
		{
			employee=optional.get();
		}
		else
		{
			throw new RuntimeException("data is not found for entered id");
		}
		return employee;
	}

	@Override
	public void deleteById(int id) {
		this.repository.deleteById(id);
	}

}
