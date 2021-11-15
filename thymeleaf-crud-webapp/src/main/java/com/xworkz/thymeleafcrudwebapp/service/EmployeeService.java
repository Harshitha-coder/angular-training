package com.xworkz.thymeleafcrudwebapp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.xworkz.thymeleafcrudwebapp.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public void deleteEmployeeById(int id);
	
	public Page<Employee> findPage(int pageNo,int pageSize);
}
