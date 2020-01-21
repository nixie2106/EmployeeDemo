package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Employee;
import com.company.service.EmployeeService;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	EmployeeService  empService;
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		
		Employee emp = new Employee("101", "JOHN", "MATHEWS");
		empService.saveEmployee(emp);
		return emp;
		
	}
	
	@GetMapping("/employee/{name}")
	public String getEmployeeName(@PathVariable String name) {
		
		return "Hello " + name;
		
	}
	
	

}
