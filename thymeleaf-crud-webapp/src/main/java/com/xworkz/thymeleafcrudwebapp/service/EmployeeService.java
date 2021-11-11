package com.xworkz.thymeleafcrudwebapp.service;

import java.util.List;

import com.xworkz.thymeleafcrudwebapp.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public void deleteEmployeeById(int id);
}
