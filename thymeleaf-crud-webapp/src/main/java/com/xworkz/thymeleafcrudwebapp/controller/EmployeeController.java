package com.xworkz.thymeleafcrudwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.thymeleafcrudwebapp.model.Employee;
import com.xworkz.thymeleafcrudwebapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model)
	{
		model.addAttribute("listOfEmployees",service.getAllEmployees());
		return "index";
	}
	
	@GetMapping("/showNewEmployee")
	public String showNewEmployee(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String savePage(@ModelAttribute("employee") Employee employee)
	{
		this.service.saveEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/showUpdateEmployee/{id}")
	public String updateById(@PathVariable(value="id") int id,Model model)
	{		
		Employee employee=this.service.getById(id);
		model.addAttribute("employee",employee);
		return "update_employee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteById(@PathVariable(value="id") int id)
	{		
		this.service.deleteById(id);
		return "redirect:/";
	}
}
