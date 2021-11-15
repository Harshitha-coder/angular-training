package com.xworkz.thymeleafcrudwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
	public String getEmployee(Model model) {
		//model.addAttribute("listOfEmployees", service.getAllEmployees());
		return this.findPaginated(1, model);
	
	}

	@GetMapping("/showNewEmployee")
	public String showNewEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		this.service.saveEmployee(employee);
		return "redirect:/";
	}

	@GetMapping("/showUpdateEmployee/{id}")
	public String updateEmployee(@PathVariable(value = "id") int id, Model model) {
		Employee employee = this.service.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") int id) {
		this.service.deleteEmployeeById(id);
		return "redirect:/";
	}

	@GetMapping("/findPage/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		int pageSize = 5;
		Page<Employee> page = this.service.findPage(pageNo, pageSize);
		List<Employee> listOfEmployees = page.getContent();
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("listOfEmployees", listOfEmployees);
		return "index";
	}
}
